package com.example.valorant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_agentes, btn_mapas, btn_arsenal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IniciarComponentes();

        btn_agentes.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AgentesActivity.class);
            startActivity(intent);
        });

        btn_mapas.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MapasActivity.class);
            startActivity(intent);
        });

        btn_arsenal.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ArsenalActivity.class);
            startActivity(intent);
        });


    }


    private void IniciarComponentes() {

        btn_agentes =findViewById(R.id.btn_agente);
        btn_mapas = findViewById(R.id.btn_mapa);
        btn_arsenal = findViewById(R.id.btn_arsenal);
    }
}