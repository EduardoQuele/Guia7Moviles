package com.example.guia7moviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class PuntajeActivity extends AppCompatActivity {

    TextView lblPuntaje;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puntaje);
        setTitle("Mi puntaje");

        lblPuntaje = findViewById(R.id.lblPuntaje);
        sharedPreferences = this.getSharedPreferences("ArchivoPuntaje", this.MODE_PRIVATE);
        // Extraer dato
        int PuntajeActual = sharedPreferences.getInt("PuntajeActual",0);

        lblPuntaje.setText(Integer.toString(PuntajeActual));
    }
}
