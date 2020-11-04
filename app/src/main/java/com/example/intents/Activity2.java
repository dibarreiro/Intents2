package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        TextView textView = findViewById(R.id.salutacio);


        //String nom = getIntent().getStringExtra("etqNom");

        Bundle sacRecuperat = getIntent().getExtras();
        String nom = sacRecuperat.getString("etqNom");
        int edat = sacRecuperat.getInt("etqEdat");
        textView.setText("Hola" +nom+ ",tienes" +edat+ "años");
    }
}