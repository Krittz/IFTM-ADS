package com.krittz.trabalhofinal;

import android.content.Intent;
import android.graphics.Color;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;

import com.github.mikephil.charting.charts.ScatterChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;

import com.github.mikephil.charting.data.ScatterData;
import com.github.mikephil.charting.data.ScatterDataSet;

import com.krittz.trabalhofinal.dao.MediaDAO;
import com.krittz.trabalhofinal.model.Media;


import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    AppCompatTextView userName, lastMediaTV;
    AppCompatButton btnAbastecer;
    MediaDAO mediaDAO;
    String userEmail, userId, lastMedia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        btnAbastecer = findViewById(R.id.btnAbastecer);
        lastMediaTV = findViewById(R.id.lastMedia);
        mediaDAO = new MediaDAO(this);

        try {
            userEmail = getIntent().getStringExtra("USER_EMAIL");
            userId = getIntent().getStringExtra("USER_ID");

            if (userEmail != null) {
                String username = userEmail.split("@")[0];
                userName = findViewById(R.id.nomeUsuario);
                username = username.substring(0, 1).toUpperCase() + username.substring(1);
                userName.setText(username);
            } else {
                Toast.makeText(this, "Erro ao obter o email do usuário", Toast.LENGTH_SHORT).show();
            }

        } catch (NumberFormatException e) {

            Toast.makeText(this, "Erro ao converter o ID do usuário para inteiro", Toast.LENGTH_SHORT).show();
        } catch (NullPointerException e) {
            Toast.makeText(this, "Ocorreu um erro inesperado", Toast.LENGTH_SHORT).show();
        }

        Media m = mediaDAO.getMediaByUserID(Integer.parseInt(userId));
        if (m != null) {
            lastMediaTV.setText(String.valueOf(m.getTotal()) + " Km/l");
        } else {
            lastMediaTV.setText("");
        }

        ScatterChart scatterChart = findViewById(R.id.chart);

        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(new Entry(m.getLitros().floatValue() / 100, m.getQuilometros().floatValue() / 100));

        int orangeColor = getColor(R.color.orange);

        ScatterDataSet dataSet = new ScatterDataSet(entries, "Consumo de Gasolina");
        dataSet.setDrawIcons(false);
        dataSet.setColor(getColor(R.color.orange));
        dataSet.setScatterShape(ScatterChart.ScatterShape.CIRCLE);
        dataSet.setScatterShapeSize(5f);
        dataSet.setValueTextSize(14f);
        dataSet.setValueTextColor(Color.WHITE);
        dataSet.setDrawValues(true);

        ScatterData scatterData = new ScatterData(dataSet);

        Description description = new Description();
        description.setTextColor(getColor(R.color.white));
        description.setTextSize(11);
        description.setText("Médias de Consumo de Combustível");
        scatterChart.setDescription(description);

        XAxis xAxis = scatterChart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setTextColor(getColor(R.color.orange));
        xAxis.setTextSize(14);

        YAxis leftAxis = scatterChart.getAxisLeft();
        leftAxis.setTextColor(getColor(R.color.pink));
        leftAxis.setTextSize(14);
        leftAxis.setAxisMinimum(0f);
        leftAxis.setGranularity(1f);

        YAxis rightAxis = scatterChart.getAxisRight();
        rightAxis.setEnabled(false);

        Legend legend = scatterChart.getLegend();
        legend.setTextSize(12f);
        legend.setTextColor(Color.WHITE);

        scatterChart.setData(scatterData);
        scatterChart.invalidate();



        btnAbastecer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, SupplyActivity.class);
                i.putExtra("USER_EMAIL", userEmail);
                i.putExtra("USER_ID", userId);
                startActivity(i);
            }
        });
    }
}
