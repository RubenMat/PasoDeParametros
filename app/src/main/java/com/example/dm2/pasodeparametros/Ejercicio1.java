package com.example.dm2.pasodeparametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ejercicio1 extends AppCompatActivity {

    private Button btnVerificar,btnVolver;
    private EditText txtNom, txtApe;
    private String nom,ape;
    private TextView lblCondiciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);

        btnVerificar=(Button)findViewById(R.id.btnVerificar);
        txtNom=(EditText)findViewById(R.id.txtNombre);
        txtApe=(EditText)findViewById(R.id.txtApellido);
        lblCondiciones=(TextView)findViewById(R.id.lblCondiciones);
        btnVolver=(Button)findViewById(R.id.btnVolver);


        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nom=txtNom.getText().toString();
                ape=txtApe.getText().toString();
                Intent intento = new Intent(Ejercicio1.this,Aceptarcondiciones.class);
                intento.putExtra("nombre", nom);
                intento.putExtra("apellido", ape);
                startActivityForResult(intento,1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String respuesta = data.getExtras().getString("result");
        if(requestCode==1 && resultCode==RESULT_OK){
            lblCondiciones.setText("Aceptas condiciones: " + respuesta);
        }
        else
        {
            lblCondiciones.setText("Aceptas condiciones: " + respuesta);
        }
    }
}
