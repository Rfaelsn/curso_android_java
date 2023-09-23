package com.example.aula01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double num1, num2, result;

    Button btn_somar;
    Button btn_subtrair;
    Button btn_multiplicar;
    Button btn_dividir;
    EditText et_valor1;
    EditText et_valor2;
    TextView tv_resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_somar = findViewById(R.id.btn_somar);
        btn_subtrair = findViewById(R.id.btn_subtrair);
        btn_multiplicar = findViewById(R.id.btn_multiplicar);
        btn_dividir = findViewById(R.id.btn_dividir);

        et_valor1 = findViewById(R.id.et_valor1);
        et_valor2 = findViewById(R.id.et_valor2);

        tv_resultado = findViewById(R.id.tv_resultado);

    }

    public void somar(View v){
        num1 = Double.parseDouble(et_valor1.getText().toString());
        num2 = Double.parseDouble(et_valor2.getText().toString());
        result = num1 + num2;
        tv_resultado.setText(String.valueOf(result));
    }

    public void subtrair(View v){
        num1 = Double.parseDouble(et_valor1.getText().toString());
        num2 = Double.parseDouble(et_valor2.getText().toString());
        result = num1 - num2;
        tv_resultado.setText(String.valueOf(result));
    }

    public void multiplicar(View v){
        num1 = Double.parseDouble(et_valor1.getText().toString());
        num2 = Double.parseDouble(et_valor2.getText().toString());
        result = num1 * num2;
        tv_resultado.setText(String.valueOf(result));
    }

    public void dividir(View v){
        num1 = Double.parseDouble(et_valor1.getText().toString());
        num2 = Double.parseDouble(et_valor2.getText().toString());
        result = num1 / num2;
        tv_resultado.setText(String.valueOf(result));
    }




}