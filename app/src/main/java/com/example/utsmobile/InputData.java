package com.example.utsmobile;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class InputData extends AppCompatActivity {

    private EditText editTextName;
    private EditText editTextEmail;
    private EditText editTextAgama;
    private EditText editTextUniversitas;
    private EditText editTextProdi;
    private Button buttonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_data);

        editTextName = findViewById(R.id.editTextName);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextAgama = findViewById(R.id.editTextAgama);
        editTextUniversitas = findViewById(R.id.editTextUniversitas);
        editTextProdi = findViewById(R.id.editTextProdi);
        buttonSend = findViewById(R.id.buttonSend);

        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                String email = editTextEmail.getText().toString();
                String agama = editTextAgama.getText().toString();
                String universitas = editTextUniversitas.getText().toString();
                String prodi = editTextProdi.getText().toString();

                if (name.isEmpty() || email.isEmpty() || agama.isEmpty() || universitas.isEmpty() || prodi.isEmpty()) {
                    showAlert("Please fill in all fields");
                } else {
                    Intent intent = new Intent(InputData.this, TampilDataActivity.class);
                    intent.putExtra("NAME", name);
                    intent.putExtra("EMAIL", email);
                    intent.putExtra("AGAMA", agama);
                    intent.putExtra("UNIVERSITAS", universitas);
                    intent.putExtra("PRODI", prodi);
                    startActivity(intent);
                }
            }
        });
    }

    private void showAlert(String message) {
        new AlertDialog.Builder(this)
                .setTitle("Input Error")
                .setMessage(message)
                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }
}
