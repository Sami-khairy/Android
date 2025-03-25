package com.example.quizzapp_khairy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Quiz1 extends AppCompatActivity {

     int resultat = 0;
     Button bNext;
     RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_quiz1);

        bNext = findViewById(R.id.bNext1);
        rg = findViewById(R.id.rg1);

        bNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId = rg.getCheckedRadioButtonId();

                if (selectedId == -1) {
                    Toast.makeText(getApplicationContext(), "Please choose one response!", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Vérification par ID
                if (selectedId == R.id.rb2) {
                    resultat += 10;
                }

                // Passer à l'activité suivante
                Intent intent = new Intent(Quiz1.this, Quiz2.class);
                intent.putExtra("resultat", resultat);
                startActivity(intent);
                }
        });
    }
}
