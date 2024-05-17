package com.example.utsmobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText editTextUsername;
    private EditText editTextPassword;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();

                if (validateCredentials(username, password)) {
                    // Pindah ke halaman berikutnya jika valid
                    Intent intent = new Intent(MainActivity.this, InputData.class);
                    startActivity(intent);
                } else {
                    // Kembali ke SplashScreen jika tidak valid
                    Toast.makeText(MainActivity.this, "Username atau Password salah", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, SplashScreenActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
    private boolean validateCredentials(String username, String password) {
        // Ganti dengan logika validasi Anda
        return username.equals("211221005") && password.equals("utsmobile");
    }
}