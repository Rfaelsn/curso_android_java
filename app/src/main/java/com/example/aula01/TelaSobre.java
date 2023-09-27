package com.example.aula01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TelaSobre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_sobre);
    }

    public void voltarTelaPrincipal(View v){
        Intent itTelaPrincipal = new Intent(this, MainActivity.class);
        startActivity(itTelaPrincipal);
//        setContentView(R.layout.activity_main);
    }
}