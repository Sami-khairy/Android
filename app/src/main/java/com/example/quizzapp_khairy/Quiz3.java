package com.example.quizzapp_khairy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class Quiz3 extends AppCompatActivity {
    int resultat;
    Button bNext;
    RadioGroup rg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_quiz3);

        resultat = getIntent().getIntExtra("resultat",0);


        bNext = findViewById(R.id.bNext3);
        rg = findViewById(R.id.rg3);

        bNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId = rg.getCheckedRadioButtonId();

                if(selectedId == -1){
                    Toast.makeText(getApplicationContext(), "Please choose one response !", Toast.LENGTH_SHORT).show();
                    return;
                }

                if(selectedId == R.id.rb5){
                    resultat += 10;
                }

                Intent intent = new Intent(Quiz3.this, Quiz4.class);
                intent.putExtra("resultat", resultat);
                startActivity(intent);
            }
        });

    }
}