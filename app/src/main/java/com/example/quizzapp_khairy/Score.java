package com.example.quizzapp_khairy;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.progressindicator.CircularProgressIndicator;


public class Score extends AppCompatActivity {

    int resultat;
    TextView tvScore;
    CircularProgressIndicator progress_circular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_score);

        resultat = getIntent().getIntExtra("resultat",0);

        tvScore = findViewById(R.id.tvScore);
        progress_circular = findViewById(R.id.progress_circular);

        progress_circular.setProgress(resultat);
        tvScore.setText(resultat+"%");

    }
}