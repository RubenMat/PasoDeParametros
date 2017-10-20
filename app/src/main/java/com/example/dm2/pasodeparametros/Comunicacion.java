package com.example.dm2.pasodeparametros;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Comunicacion extends AppCompatActivity {

    String user,pass;
    TextView lblComu;
    Button btnTerminar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comunicacion);

        lblComu=(TextView)findViewById(R.id.lblComu);

        Bundle bundle = getIntent().getExtras();
        user=bundle.getString("Usuario");
        pass=bundle.getString("Password");
        System.out.println(user);

        btnTerminar=(Button)findViewById(R.id.btnTerminar);

        btnTerminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(Comunicacion.this,Ejercicio2.class);
                setResult(RESULT_OK,intento);
                finish();
            }
        });

        if(user.equalsIgnoreCase("Ruben") && pass.equals("1234")){
            lblComu.setText("EL USUARIO y la PASSWORD son CORRECTAS");
            lblComu.setBackgroundColor(Color.GREEN);
        }
        else {
            lblComu.setText("USUARIO Y/O PASSWORD INCORRECTA");
            lblComu.setBackgroundColor(Color.RED);
        }
    }




}
