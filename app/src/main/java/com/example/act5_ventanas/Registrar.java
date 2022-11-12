package com.example.act5_ventanas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registrar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
         Button btn3;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);
        btn3=findViewById(R.id.btn3);
    }
    public void validar (View view)
    {
        Intent siguiente = new Intent(Registrar.this,saludo.class);
        startActivity(siguiente);
    }
    public void salir (View view)
    {
        Intent salida = new Intent(Registrar.this,Salida.class);
        startActivity(salida);
    }
}