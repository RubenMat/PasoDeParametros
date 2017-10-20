package com.example.dm2.pasodeparametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class Ejercicio4 extends AppCompatActivity {

    CheckBox chk1,chk2,chk3,chk4;
    RadioButton rb1,rb2;
    EditText txtNom, txtApe;
    Button btnEnviar;
    String nom,ape,radio,checks="Aficiones: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio4);

        txtNom = (EditText)findViewById(R.id.txtNombre);
        txtApe = (EditText)findViewById(R.id.txtApellidos);

        rb1=(RadioButton)findViewById(R.id.rbMasculino);
        rb2=(RadioButton)findViewById(R.id.rbFemenino);

        chk1=(CheckBox)findViewById(R.id.chkMusica);
        chk2=(CheckBox)findViewById(R.id.chkLectura);
        chk3=(CheckBox)findViewById(R.id.chkDeporte);
        chk4=(CheckBox)findViewById(R.id.chkViajar);

        btnEnviar=(Button)findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nom=txtNom.getText().toString();
                ape=txtApe.getText().toString();

                if(rb1.isChecked()) {
                    radio = "Masculino";
                }
                else{
                    if(rb2.isChecked()) {
                        radio = "Femenino";
                    }
                    else
                        radio="NS/NC";
                }

                if(chk1.isChecked())
                    checks+="Música ";
                if(chk2.isChecked())
                    checks+="Lectura ";
                if(chk3.isChecked())
                    checks+="Deportes ";
                if(chk4.isChecked())
                    checks+="Viajar.";


                Intent intento = new Intent(Ejercicio4.this,RecoleccionDeDatos.class);
                intento.putExtra("nom",nom);
                intento.putExtra("ape",ape);
                intento.putExtra("radio",radio);
                intento.putExtra("checks",checks);
                startActivity(intento);
            }
        });

    }
}
