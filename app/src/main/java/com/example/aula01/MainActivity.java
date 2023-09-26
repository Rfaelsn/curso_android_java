package com.example.aula01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double num1, num2, result;
    EditText et_valor1;
    EditText et_valor2;
    TextView tv_resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_somar = findViewById(R.id.btn_somar);
        Button btn_subtrair = findViewById(R.id.btn_subtrair);
        Button btn_multiplicar = findViewById(R.id.btn_multiplicar);
        Button btn_dividir = findViewById(R.id.btn_dividir);

        et_valor1 = findViewById(R.id.et_valor1);
        et_valor2 = findViewById(R.id.et_valor2);

        tv_resultado = findViewById(R.id.tv_resultado);

        /* primeira forma
        * btn_somar.setOnClickListener(new View.onClickListener(){
        *   public void onClick(View v){
        *       num1 = Double.parseDouble(et_valor1.getText().toString());
                num2 = Double.parseDouble(et_valor2.getText().toString());
                result = num1 + num2;
                tv_resultado.setText(String.valueOf(result));
        *   }
        * });
        * */

    }

//    public void somar(View v){  //segunda forma
//    //podemos fazer a seleção direta de cada metodo pelo xml
//        num1 = Double.parseDouble(et_valor1.getText().toString());
//        num2 = Double.parseDouble(et_valor2.getText().toString());
//        result = num1 + num2;
//        tv_resultado.setText(String.valueOf(result));
//    }

    public void somar(){
        num1 = Double.parseDouble(et_valor1.getText().toString());
        num2 = Double.parseDouble(et_valor2.getText().toString());
        result = num1 + num2;
        tv_resultado.setText(String.valueOf(result));
    }

    public void subtrair(){
        num1 = Double.parseDouble(et_valor1.getText().toString());
        num2 = Double.parseDouble(et_valor2.getText().toString());
        result = num1 - num2;
        tv_resultado.setText(String.valueOf(result));
    }

    public void multiplicar(){
        num1 = Double.parseDouble(et_valor1.getText().toString());
        num2 = Double.parseDouble(et_valor2.getText().toString());
        result = num1 * num2;
        tv_resultado.setText(String.valueOf(result));
    }

    public void dividir(){
        num1 = Double.parseDouble(et_valor1.getText().toString());
        num2 = Double.parseDouble(et_valor2.getText().toString());
        result = num1 / num2;
        tv_resultado.setText(String.valueOf(result));
    }

    public void calculate(View v){
        final int  id_view_clicada = v.getId();
        final int  btn_somar = R.id.btn_somar;

        if (id_view_clicada == R.id.btn_somar) {
            somar();
        } else if (id_view_clicada == R.id.btn_subtrair) {
            subtrair();
        } else if (id_view_clicada == R.id.btn_multiplicar) {
            multiplicar();
        } else if (id_view_clicada == R.id.btn_dividir) {
            dividir();
        }
    }


}