package com.krittz.trabalhofinal;

import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.utils.Utils;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    AppCompatTextView userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);


        try {
            String userEmail = getIntent().getStringExtra("USER_EMAIL");

            if (userEmail != null) {
                String username = userEmail.split("@")[0];
                userName = findViewById(R.id.nomeUsuario);
                username = username.substring(0, 1).toUpperCase() + username.substring(1);
                userName.setText(username);
            } else {


                Toast.makeText(this, "Erro ao obter o email do usuário", Toast.LENGTH_SHORT).show();
            }
        } catch (NullPointerException e) {


            Toast.makeText(this, "Ocorreu um erro inesperado", Toast.LENGTH_SHORT).show();
        }


        LineChart lineChart = findViewById(R.id.chart);

        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(new Entry(1, 25));
        entries.add(new Entry(2, 30));
        entries.add(new Entry(3, 20));
        entries.add(new Entry(4, 35));
        entries.add(new Entry(5, 40));
        entries.add(new Entry(6, 28));
        entries.add(new Entry(7, 32));
        int orangeColor = getColor(R.color.orange);


        LineDataSet dataSet = new LineDataSet(entries, "Consumo de Gasolina");
        dataSet.setDrawIcons(false);
        dataSet.enableDashedLine(10f, 5f, 0f);
        dataSet.enableDashedHighlightLine(10f, 5f, 0f);
        dataSet.setColor(getColor(R.color.orange));
        dataSet.setCircleColor(getColor(R.color.pink));
        dataSet.setLineWidth(2f);
        dataSet.setCircleRadius(5f);
        dataSet.setDrawCircleHole(false);
        dataSet.setValueTextSize(14f);
        dataSet.setValueTextColor(Color.WHITE);
        dataSet.setDrawFilled(true);
        dataSet.setFormLineWidth(2f);
        dataSet.setFormLineDashEffect(new DashPathEffect(new float[]{10f, 5f}, 0f));
        dataSet.setFormSize(15.f);
        if (Utils.getSDKInt() >= 18) {
            Drawable drawable = ContextCompat.getDrawable(this, R.drawable.chart);
            dataSet.setFillDrawable(drawable);
        }

        LineData lineData = new LineData(dataSet);

        Description description = new Description();
        description.setTextColor(getColor(R.color.white));
        description.setTextSize(11);
        description.setText("Médias de Consumo de Gasolina (últimos 7 dias)");
        lineChart.setDescription(description);


        XAxis xAxis = lineChart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setTextColor(getColor(R.color.orange));
        xAxis.setTextSize(14);

        YAxis leftAxis = lineChart.getAxisLeft();
        leftAxis.setTextColor(getColor(R.color.pink));
        leftAxis.setTextSize(14);
        leftAxis.setAxisMinimum(0f);
        leftAxis.setGranularity(1f);

        YAxis rightAxis = lineChart.getAxisRight();
        rightAxis.setEnabled(false);


        Legend legend = lineChart.getLegend();
        legend.setForm(Legend.LegendForm.LINE);
        legend.setTextSize(12f);
        legend.setTextColor(Color.WHITE);


        lineChart.setData(lineData);
    }
}
