package com.krittz.trabalhofinal;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import lecho.lib.hellocharts.model.PieChartData;
import lecho.lib.hellocharts.model.SliceValue;
import lecho.lib.hellocharts.view.PieChartView;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        PieChartView pieChartView = findViewById(R.id.chart);

        // Configuração do gráfico de torta
        List<SliceValue> pieData = new ArrayList<>();
        pieData.add(new SliceValue(30, getResources().getColor(R.color.darkDetail)).setLabel("Categoria 1"));
        pieData.add(new SliceValue(45, getResources().getColor(R.color.orange)).setLabel("Categoria 2"));
        pieData.add(new SliceValue(25, getResources().getColor(R.color.pink)).setLabel("Categoria 3"));

        PieChartData pieChartData = new PieChartData(pieData);
        pieChartData.setHasLabels(true).setValueLabelTextSize(12);

        // Define o gráfico de torta na PieChartView
        pieChartView.setPieChartData(pieChartData);
    }
}
