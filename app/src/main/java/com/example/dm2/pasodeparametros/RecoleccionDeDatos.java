package com.example.dm2.pasodeparametros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RecoleccionDeDatos extends AppCompatActivity {

    TextView nom,ape,radio,checks;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recoleccion_de_datos);

        nom=(TextView)findViewById(R.id.lblNom);
        ape=(TextView)findViewById(R.id.lblApe);
        radio=(TextView)findViewById(R.id.lblSex);
        checks=(TextView)findViewById(R.id.Checks);

        Bundle bundle = getIntent().getExtras();

        nom.setText("Nombre: "+ bundle.getString("nom"));
        ape.setText("Apellidos: " + bundle.getString("ape"));
        radio.setText("Sexo: "+bundle.getString("radio"));
        checks.setText(bundle.getString("checks"));


    }
}
