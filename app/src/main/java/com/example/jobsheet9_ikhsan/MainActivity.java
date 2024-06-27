package com.example.jobsheet9_ikhsan;

import android.content.Intent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button buttonProfilMahasiswa;
    private Button buttonProfilStmik;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonProfilMahasiswa = findViewById(R.id.buttonProfilMahasiswa);
        buttonProfilStmik = findViewById(R.id.buttonProfilStmik);

        buttonProfilMahasiswa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProfilActivityMahasiswa.class);
                startActivity(intent);
            }
        });

        buttonProfilStmik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProfilActivitySTMIK.class);
                startActivity(intent);
            }
        });
    }
}