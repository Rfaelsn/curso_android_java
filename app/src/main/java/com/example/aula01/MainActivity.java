package com.example.aula01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn_action = (Button) findViewById(R.id.btn_ativation);
        TextView tv_result_nome = (TextView) findViewById(R.id.tv_result_name);
        EditText et_nome = (EditText) findViewById(R.id.et_name);

        btn_action.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                tv_result_nome.setText(et_nome.getText());
            }
        });
    }


}