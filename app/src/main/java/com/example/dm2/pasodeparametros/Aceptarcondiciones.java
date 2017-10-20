package com.example.dm2.pasodeparametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Aceptarcondiciones extends AppCompatActivity {

    private String nom,ape;
    private TextView lblSaludo;
    private Button btnAceptar, btnRechazar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle extras = getIntent().getExtras();
        nom=extras.getString("nombre");
        ape=extras.getString("apellido");

        setContentView(R.layout.activity_aceptarcondiciones);

        lblSaludo=(TextView)findViewById(R.id.lblSaludo);

        lblSaludo.setText("Hola " + nom +" " + ape + " ¿Aceptas las condiciones?");

        btnAceptar=(Button)findViewById(R.id.btnAceptar);
        btnRechazar=(Button)findViewById(R.id.btnRechazar);

        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(Aceptarcondiciones.this,Ejercicio1.class);
                intento.putExtra("result","Aceptado");
                setResult(RESULT_OK,intento);
                finish();
            }
        });

        btnRechazar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(Aceptarcondiciones.this,Ejercicio1.class);
                intento.putExtra("result","RECHAZADO");
                setResult(RESULT_CANCELED,intento);
                finish();
            }
        });

    }
}
