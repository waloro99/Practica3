package com.example.roo.practica3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.segundaventana;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button boton = (Button) findViewById(R.id.button);


        boton.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Intent a = new Intent(this, segundaventana.class);
        //Inicia la actividad
        startActivity(a);
    }
}
