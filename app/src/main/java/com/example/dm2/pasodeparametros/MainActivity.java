package com.example.dm2.pasodeparametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn1,btn2,btn3,btn4,btnSalir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=(Button)findViewById(R.id.Ejercicio1);
        btn2=(Button)findViewById(R.id.Ejercicio2);
        btn3=(Button)findViewById(R.id.Ejercicio3);
        btn4=(Button)findViewById(R.id.Ejercicio4);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(MainActivity.this,Ejercicio1.class);
                startActivity(intento);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(MainActivity.this,Ejercicio2.class);
                startActivity(intento);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento=new Intent(MainActivity.this,Ejercicio3.class);
                startActivity(intento);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento=new Intent(MainActivity.this,Ejercicio4.class);
                startActivity(intento);
            }
        });

    }
}
