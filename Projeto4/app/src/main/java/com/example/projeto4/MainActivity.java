package com.example.projeto4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Defina os listeners para os botões ou ações necessárias na MainActivity
        findViewById(R.id.btn_calcular).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iniciarAtividadeFragmentos();
            }
        });
    }

    // Método para iniciar a atividade FragmentosActivity
    private void iniciarAtividadeFragmentos() {
        Intent intent = new Intent(this, FragmenetosActivity.class);
        startActivity(intent);
    }
}