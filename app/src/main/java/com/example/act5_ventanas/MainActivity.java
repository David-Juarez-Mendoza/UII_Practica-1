package com.example.act5_ventanas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btn1,btn5;

    String nombre="Juan Perez",login = "Juan", pass="123";
    private EditText log, pas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        log=findViewById(R.id.usuario);
        pas=findViewById(R.id.contraseña);
    }
    public void validar (View view)
    {
        Intent saludo = new Intent(MainActivity.this,saludo.class);
        Intent error=new Intent(MainActivity.this, Registrar.class);
        String l=log.getText().toString();
        String p=pas.getText().toString();
        if (l.equals(login)&& p.equals(pass)){
            saludo.putExtra("nombre",nombre);
            startActivity(saludo);
        }
        else {
            startActivity(error);
        }
    }
    public void limpiar (View view)
    {
        
    }
}