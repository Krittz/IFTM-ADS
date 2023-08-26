package com.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.calculadora.logic.Calculadora;

public class MainActivity extends AppCompatActivity {

    Calculadora calculadora = new Calculadora();
    String operation;
    double x;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);
        Button btn0 = findViewById(R.id.btn0);
        Button btnDot = findViewById(R.id.btnDot);
        Button btnSqrt = findViewById(R.id.btnSqrt);
        Button btnPlus = findViewById(R.id.btnPlus);
        Button btnMinus = findViewById(R.id.btnMinus);
        Button btnDivide = findViewById(R.id.btnDivide);
        Button btnEquals = findViewById(R.id.btnEquals);
        Button btnMultiply = findViewById(R.id.btnMultiply);
        Button btnClear = findViewById(R.id.btnClear);
        TextView screen = findViewById(R.id.screen);
        btnEquals.setEnabled(false);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText("");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText() + "9");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText() + ".");
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x = Double.parseDouble(screen.getText().toString());
                operation = "sum";
                screen.setText("");
                btnEquals.setEnabled(true);

            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x = Double.parseDouble(screen.getText().toString());
                operation = "minus";
                screen.setText("");
                btnEquals.setEnabled(true);
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x = Double.parseDouble(screen.getText().toString());
                operation = "multiply";
                screen.setText("");
                btnEquals.setEnabled(true);
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x = Double.parseDouble(screen.getText().toString());
                operation = "divide";
                screen.setText("");
            }
        });
        btnSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(String.valueOf(calculadora.sqrt(Double.parseDouble(screen.getText().toString()))));

            }
        });
        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operation.isEmpty()) {
                    screen.setText("");
                } else {


                    switch (operation) {
                        case "sum":
                            screen.setText(String.valueOf(calculadora.sum(x, Double.parseDouble(screen.getText().toString()))));
                            operation = "";
                            break;
                        case "minus":
                            screen.setText(String.valueOf(calculadora.minus(x, Double.parseDouble(screen.getText().toString()))));
                            operation = "";
                            break;
                        case "multiply":
                            screen.setText(String.valueOf(calculadora.multiply(x, Double.parseDouble(screen.getText().toString()))));
                            operation = "";
                            break;
                        case "divide":
                            screen.setText(String.valueOf(calculadora.divide(x, Double.parseDouble(screen.getText().toString()))));
                            operation = "";
                            break;
                        default:
                            operation = "";
                            screen.setText(screen.getText().toString());
                            break;
                    }
                }
            }
        });

    }


}