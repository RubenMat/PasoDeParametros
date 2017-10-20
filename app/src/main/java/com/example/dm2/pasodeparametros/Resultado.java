package com.example.dm2.pasodeparametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    Button btnVolver;
    String result;
    TextView lblResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Bundle bundle= getIntent().getExtras();
        result=bundle.getString("result");

        lblResult=(TextView)findViewById(R.id.lblResult);
        lblResult.setText("El resultado de la operación es " + result);

        btnVolver=(Button)findViewById(R.id.btnVolverRes);
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(Resultado.this,Ejercicio3.class);
                if(result.equalsIgnoreCase("CORRECTO"))
                    setResult(RESULT_OK,intento);
                else
                    setResult(RESULT_CANCELED,intento);
                finish();
            }
        });
    }
}
