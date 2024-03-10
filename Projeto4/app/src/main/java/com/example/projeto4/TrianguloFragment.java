package com.example.projeto4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TrianguloFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TrianguloFragment extends Fragment {
    private EditText etBase;
    private EditText etAltura;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_triangulo, container, false);

        etBase = view.findViewById(R.id.et_base);
        etAltura = view.findViewById(R.id.et_altura);
        Button btnCalcular = view.findViewById(R.id.btn_calcular_triangulo);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularAreaTriangulo();
            }
        });

        return view;
    }

    private void calcularAreaTriangulo() {
        if (etBase.getText().toString().isEmpty() || etAltura.getText().toString().isEmpty()) {
            Toast.makeText(getActivity(), "Por favor, preencha todos os campos.", Toast.LENGTH_SHORT).show();
            return;
        }

        double base = Double.parseDouble(etBase.getText().toString());
        double altura = Double.parseDouble(etAltura.getText().toString());

        double area = (base * altura) / 2;

        Toast.makeText(getActivity(), "A área do triângulo é: " + area, Toast.LENGTH_SHORT).show();
    }
}