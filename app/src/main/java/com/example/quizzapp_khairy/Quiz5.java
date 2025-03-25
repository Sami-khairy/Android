package com.example.quizzapp_khairy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class Quiz5 extends AppCompatActivity {
    int resultat;
    Button bNext;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_quiz5);

        resultat = getIntent().getIntExtra("resultat",0);


        bNext = findViewById(R.id.bNext5);
        rg = findViewById(R.id.rg5);

        bNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId = rg.getCheckedRadioButtonId();

                if(selectedId == -1){
                    Toast.makeText(getApplicationContext(), "Please choose one response !", Toast.LENGTH_SHORT).show();
                    return;
                }

                if(selectedId == R.id.rb10){
                    resultat += 10;
                }

                Intent intent = new Intent(Quiz5.this, Score.class);
                intent.putExtra("resultat", resultat);
                startActivity(intent);
            }
        });

    }
}