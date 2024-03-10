package com.example.atividadesorteiodeprmios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView img_resultado;
    private Button btn_sorteio;
    private Integer imagens [] = {R.drawable.premio, R.drawable.ganho, R.drawable.carro, R.drawable.img, R.drawable.img_1, R.drawable.img_2 ,R.drawable.img_3 , R.drawable.img_4 };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        img_resultado = findViewById(R.id.img_resultado);
        btn_sorteio = findViewById(R.id.btn_sorteio);

        btn_sorteio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = new Random().nextInt(10); //gerar números aleátorios
                img_resultado.setImageResource(imagens[num]);
            }
        });


    }
}