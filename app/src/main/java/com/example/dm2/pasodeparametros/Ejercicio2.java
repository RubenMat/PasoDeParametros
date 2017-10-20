package com.example.dm2.pasodeparametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Ejercicio2 extends AppCompatActivity {

    Button btnIniciar;
    EditText txtUser,txtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);

        btnIniciar=(Button)findViewById(R.id.btnIniciar);
        txtUser=(EditText)findViewById(R.id.txtUser);
        txtPass=(EditText)findViewById(R.id.txtPass);


        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(Ejercicio2.this,Comunicacion.class);
                intento.putExtra("Usuario",txtUser.getText().toString());
                intento.putExtra("Password",txtPass.getText().toString());
                startActivity(intento);
            }
        });
    }
}
