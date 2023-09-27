package com.example.aula01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.app.AlertDialog;

public class MainActivity extends AppCompatActivity {

    double vTaca, vPrato, vGarfo, vFaca, vTotal;
    EditText etTacas, etPratos, etGarfos, etFacas;
    CheckBox cbTacas, cbPratos, cbGarfos, cbFacas;
    Button btnCalcular;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etTacas = findViewById(R.id.et_tacas);
        etPratos = findViewById(R.id.et_pratos);
        etGarfos = findViewById(R.id.et_garfos);
        etFacas = findViewById(R.id.et_facas);

        cbTacas = findViewById(R.id.cb_tacas);
        cbPratos = findViewById(R.id.cb_pratos);
        cbGarfos = findViewById(R.id.cb_garfos);
        cbFacas = findViewById(R.id.cb_facas);

        btnCalcular = findViewById(R.id.btn_calcular);

        tvResultado = findViewById(R.id.tv_resultado);


        vTaca = 0.25;
        vPrato = 0.20;
        vGarfo = 0.15;
        vFaca = 0.15;
        vTotal = 0.0;
    }

    public void Calcular(View v){
        vTotal = 0.0;

        if(cbTacas.isChecked()){
            vTotal += vTaca * Double.parseDouble(etTacas.getText().toString());
        }

        if(cbPratos.isChecked()){
            vTotal += vPrato * Double.parseDouble(etPratos.getText().toString());
        }

        if(cbGarfos.isChecked()){
            vTotal += vGarfo * Double.parseDouble(etGarfos.getText().toString());
        }

        if(cbFacas.isChecked()){
            vTotal += vFaca * Double.parseDouble(etFacas.getText().toString());
        }

        tvResultado.setText("Valor total: R$: " +  vTotal);

//        Toast.makeText(this,"Valor total Calculado", Toast.LENGTH_LONG).show();
        AlertDialog.Builder cxMsg = new AlertDialog.Builder(this);
        cxMsg.setMessage("Valor total Calculado");
        cxMsg.setNeutralButton("Ok",null);
        cxMsg.show();
    }

    public void acessarTelaSobre(View v){
        Intent itTelaSobre = new Intent(this,TelaSobre.class);
        startActivity(itTelaSobre);
    }


}