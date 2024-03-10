package com.example.projeto4;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.fragment.app.Fragment;

public class TrapezioFragment extends Fragment {

    private EditText etBaseMaior;
    private EditText etBaseMenor;
    private EditText etAltura;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_trapezio, container, false);

        etBaseMaior = view.findViewById(R.id.et_base_maior);
        etBaseMenor = view.findViewById(R.id.et_base_menor);
        etAltura = view.findViewById(R.id.et_altura);
        Button btnCalcular = view.findViewById(R.id.btn_calcular_trapezio);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularAreaTrapezio();
            }
        });

        return view;
    }

    private void calcularAreaTrapezio() {
        if (etBaseMaior.getText().toString().isEmpty() || etBaseMenor.getText().toString().isEmpty() || etAltura.getText().toString().isEmpty()) {
            Toast.makeText(getActivity(), "Por favor, preencha todos os campos.", Toast.LENGTH_SHORT).show();
            return;
        }

        double baseMaior = Double.parseDouble(etBaseMaior.getText().toString());
        double baseMenor = Double.parseDouble(etBaseMenor.getText().toString());
        double altura = Double.parseDouble(etAltura.getText().toString());

        double area = ((baseMaior + baseMenor) * altura) / 2;

        Toast.makeText(getActivity(), "A área do trapézio é: " + area, Toast.LENGTH_SHORT).show();
    }
}
