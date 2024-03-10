package com.example.projeto4;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.fragment.app.Fragment;

public class LosangoFragment extends Fragment {

    private EditText etDiagonalMaior;
    private EditText etDiagonalMenor;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_losango, container, false);

        etDiagonalMaior = view.findViewById(R.id.et_diagonal_maior);
        etDiagonalMenor = view.findViewById(R.id.et_diagonal_menor);
        Button btnCalcular = view.findViewById(R.id.btn_calcular_losango);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularAreaLosango();
            }
        });

        return view;
    }

    private void calcularAreaLosango() {
        if (etDiagonalMaior.getText().toString().isEmpty() || etDiagonalMenor.getText().toString().isEmpty()) {
            Toast.makeText(getActivity(), "Por favor, preencha todos os campos.", Toast.LENGTH_SHORT).show();
            return;
        }

        double diagonalMaior = Double.parseDouble(etDiagonalMaior.getText().toString());
        double diagonalMenor = Double.parseDouble(etDiagonalMenor.getText().toString());

        double area = (diagonalMaior * diagonalMenor) / 2;

        Toast.makeText(getActivity(), "A área do losango é: " + area, Toast.LENGTH_SHORT).show();
    }
}
