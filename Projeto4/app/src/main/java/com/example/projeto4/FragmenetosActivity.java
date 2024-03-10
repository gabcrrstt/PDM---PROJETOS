package com.example.projeto4;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FragmenetosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragmenetos);

        // Inicializar o primeiro fragmento ao abrir a CalculoActivity
        replaceFragment(new TrianguloFragment());

        // Definir os listeners para os botões de navegação entre os fragmentos
        Button btn_triangulo = findViewById(R.id.btn_triangulo);
        Button btn_trapezio = findViewById(R.id.btn_trapezio);
        Button btn_losango = findViewById(R.id.btn_losango);

        btn_triangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new TrianguloFragment());
            }
        });

        btn_trapezio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new TrapezioFragment());
            }
        });

        btn_losango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new LosangoFragment());
            }
        });
    }

    // Método para substituir o fragmento no container
    private void replaceFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, fragment);
        transaction.commit();
    }
}
