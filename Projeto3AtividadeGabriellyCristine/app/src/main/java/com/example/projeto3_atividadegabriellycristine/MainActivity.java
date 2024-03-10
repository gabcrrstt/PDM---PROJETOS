package com.example.projeto3_atividadegabriellycristine;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText keywordEditText;
    private Button addButton;
    private ListView keywordListView;
    private ArrayAdapter<String> keywordAdapter;
    private ArrayList<String> keywordList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        keywordEditText = findViewById(R.id.keywordEditText);
        addButton = findViewById(R.id.addButton);
        keywordListView = findViewById(R.id.keywordListView);

        keywordList = new ArrayList<>();
        keywordAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, keywordList);
        keywordListView.setAdapter(keywordAdapter);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addKeyword();
            }
        });
    }

    private void addKeyword() {
        String keyword = keywordEditText.getText().toString().trim();
        if (!keyword.isEmpty()) {
            keywordList.add(keyword);
            keywordAdapter.notifyDataSetChanged();
            keywordEditText.setText("");
        } else {
            Toast.makeText(this, "Por favor, insira uma palavra-chave", Toast.LENGTH_SHORT).show();
        }
    }
}
