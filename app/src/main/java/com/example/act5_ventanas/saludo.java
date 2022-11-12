package com.example.act5_ventanas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class saludo extends AppCompatActivity {
    private TextView saludoM;
            Bundle datos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);
        saludoM=findViewById(R.id.saludoM);
        datos=getIntent().getExtras();
        saludoM.setText(datos.getString("nombre"));
    }

    public void salir (View view)
    {
        Intent salida = new Intent(saludo.this,Salida.class);
        startActivity(salida);
    }
}