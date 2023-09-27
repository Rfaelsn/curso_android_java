package com.example.aula01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TelaSobre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_sobre);

        Intent it = getIntent();
        String nome = it.getStringExtra("p_nome");
        double valorTotal = it.getDoubleExtra("p_vTotal", 0);
        TextView tv = findViewById(R.id.tv_nome_resultado);
        tv.setText(nome + " | "+ valorTotal);
    }

    public void voltarTelaPrincipal(View v){
        this.finish();
//        Intent itTelaPrincipal = new Intent(this, MainActivity.class);
//        startActivity(itTelaPrincipal);
//        setContentView(R.layout.activity_main);
    }
}