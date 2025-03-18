package com.example.quizzapp_khairy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    //step 1 -> declaration
    EditText etEmail, etPassword;
    Button bSignin;
    TextView tvRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //step 2 -> recuperation des ids
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        bSignin = findViewById(R.id.bSignin);
        tvRegister = findViewById(R.id.tvRegister);


        //step 3 -> association des listeners
        bSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //step 4 -> traitement
                if(etEmail.getText().toString().equals("toto") & etPassword.getText().toString().equals("123")){
                    startActivity(new Intent(MainActivity.this, Quiz1.class));
                }else {
                    Toast.makeText(getApplicationContext(),"Login or Password incorrect",Toast.LENGTH_SHORT).show();
                }
            }
        });

        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Register.class));
            }
        });
    }
}