package com.example.valorant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class AgentesActivity extends AppCompatActivity {

    Button btn_voltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agentes);

        btn_voltar.setOnClickListener(v -> {
            Intent intent = new Intent(AgentesActivity.this, Tela3.class);
            startActivity(intent);
        });
    }


}