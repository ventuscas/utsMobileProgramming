package com.example.utsmobile;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.utsmobile.R;

public class TampilDataActivity extends AppCompatActivity {

    private TextView textViewName;
    private TextView textViewEmail;
    private TextView textViewAgama;
    private TextView textViewUniversitas;
    private TextView textViewProdi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil_data);

        textViewName = findViewById(R.id.textViewName);
        textViewEmail = findViewById(R.id.textViewEmail);
        textViewAgama = findViewById(R.id.textViewAgama);
        textViewUniversitas = findViewById(R.id.textViewUniversitas);
        textViewProdi = findViewById(R.id.textViewProdi);


        // Mengambil data dari Intent
        String name = getIntent().getStringExtra("NAME");
        String email = getIntent().getStringExtra("EMAIL");
        String agama = getIntent().getStringExtra("AGAMA");
        String universitas = getIntent().getStringExtra("UNIVERSITAS");
        String prodi = getIntent().getStringExtra("PRODI");

        // Menampilkan data
        textViewName.setText(name);
        textViewEmail.setText(email);
        textViewAgama.setText(agama);
        textViewUniversitas.setText(universitas);
        textViewProdi.setText(prodi);
    }
}
