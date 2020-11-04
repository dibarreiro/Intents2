package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editText, editText2;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = findViewById(R.id.b1);

        editText = findViewById(R.id.nom);
        editText2 = findViewById(R.id.edat);

        b1.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        //TODO: RECUPERO EL VALOR DEL EDIT TEXT I LO ENVO A LA ACTIVITY 2
        String nom = editText.getText().toString();
        int edat = Integer.parseInt(editText2.getText().toString());

        Intent intent = new Intent(this, Activity2.class);
        //intent.putExtra("etqNom", nom); //SOLO ENVIAMOS UN DATO

        Bundle sac = new Bundle(); //ENVIAMOS MAS DE UN DATO
        sac.putString("etqNom", nom);
        sac.putInt("etqEdat", edat);
        intent.putExtras(sac);

        startActivity(intent);
    }
}
