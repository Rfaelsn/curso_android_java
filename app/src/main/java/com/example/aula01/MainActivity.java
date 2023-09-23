package com.example.aula01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double num1, num2, result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_somar = (Button) findViewById(R.id.btn_somar);
        Button btn_subtrair = (Button) findViewById(R.id.btn_subtrair);
        Button btn_multiplicar = (Button) findViewById(R.id.btn_multiplicar);
        Button btn_dividir = (Button) findViewById(R.id.btn_dividir);

        EditText et_valor1 = (EditText) findViewById(R.id.et_valor1);
        EditText et_valor2 = (EditText) findViewById(R.id.et_valor2);

        TextView tv_resultado = (TextView) findViewById(R.id.tv_resultado);

        btn_somar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                num1 = Double.parseDouble(et_valor1.getText().toString());
                num2 = Double.parseDouble(et_valor2.getText().toString());
                result = num1 + num2;
                tv_resultado.setText(String.valueOf(result));
            }
        });

        btn_subtrair.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                num1 = Double.parseDouble(et_valor1.getText().toString());
                num2 = Double.parseDouble(et_valor2.getText().toString());
                result = num1 - num2;
                tv_resultado.setText(String.valueOf(result));
            }
        });


        btn_multiplicar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                num1 = Double.parseDouble(et_valor1.getText().toString());
                num2 = Double.parseDouble(et_valor2.getText().toString());
                result = num1 * num2;
                tv_resultado.setText(String.valueOf(result));
            }
        });


        btn_dividir.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                num1 = Double.parseDouble(et_valor1.getText().toString());
                num2 = Double.parseDouble(et_valor2.getText().toString());
                result = num1 / num2;
                tv_resultado.setText(String.valueOf(result));
            }
        });
    }


}