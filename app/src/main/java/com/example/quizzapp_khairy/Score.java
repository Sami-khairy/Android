package com.example.quizzapp_khairy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.progressindicator.CircularProgressIndicator;


public class Score extends AppCompatActivity {

    int resultat;
    TextView tvScore;
    CircularProgressIndicator progress_circular;
    Button bLogout, bTryAgain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_score);

        resultat = getIntent().getIntExtra("resultat",0);

        tvScore = findViewById(R.id.tvScore);
        bLogout = findViewById(R.id.bLogout);
        bTryAgain = findViewById(R.id.bTryAgain);
        progress_circular = findViewById(R.id.progress_circular);

        progress_circular.setProgress(resultat);
        tvScore.setText(resultat+"%");


        bLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Score.this, MainActivity.class));
            }
        });

        bTryAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Score.this, Quiz1.class));
            }
        });

    }
}