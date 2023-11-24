package com.krittz.trabalhofinal;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    AppCompatTextView userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);


        String userEmail = getIntent().getStringExtra("USER_EMAIL");
        String username = userEmail.split("@")[0];
        userName = findViewById(R.id.nomeUsuario);
        userName.setText(username.substring(0,1).toUpperCase() + username.substring(1));

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
        dataSet.setColor(orangeColor);
        dataSet.setLineWidth(2f);
        dataSet.setValueTextColor(Color.BLACK);
        dataSet.setValueTextSize(12f);

        LineData lineData = new LineData(dataSet);

        // Configurar descrição (opcional)
        Description description = new Description();
        description.setText("Médias de Consumo de Gasolina (últimos 7 dias)");
        lineChart.setDescription(description);

        // Configurar eixos
        XAxis xAxis = lineChart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);

        YAxis leftAxis = lineChart.getAxisLeft();
        leftAxis.setAxisMinimum(0f); // Valor mínimo no eixo y
        leftAxis.setGranularity(1f); // Espaçamento entre os valores no eixo y

        YAxis rightAxis = lineChart.getAxisRight();
        rightAxis.setEnabled(false); // Desativar o eixo y à direita

        // Configurar legenda
        Legend legend = lineChart.getLegend();
        legend.setForm(Legend.LegendForm.LINE);
        legend.setTextSize(12f);

        // Adicionar dados ao gráfico
        lineChart.setData(lineData);
    }
}
