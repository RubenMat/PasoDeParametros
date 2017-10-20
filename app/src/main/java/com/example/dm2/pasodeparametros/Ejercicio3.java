package com.example.dm2.pasodeparametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ejercicio3 extends AppCompatActivity {

    Button btnComprob;
    EditText n1,n2,result;
    int num1,num2,resint,corr=0,inc=0;
    TextView lblInc, lblCorr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio3);


        btnComprob=(Button)findViewById(R.id.btnComprobar);
        n1=(EditText)findViewById(R.id.txtN1);
        n2=(EditText)findViewById(R.id.txtN2);
        result=(EditText)findViewById(R.id.txtEquals);
        lblInc=(TextView)findViewById(R.id.lblIncorrectas);
        lblCorr=(TextView)findViewById(R.id.lblCorrectas);



        n1.setText((int)(Math.random()*101)+"");
        n2.setText((int)(Math.random()*101)+"");


        btnComprob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(n1.getText().toString());
                num2=Integer.parseInt(n2.getText().toString());
                resint=Integer.parseInt(result.getText().toString());
                Intent intento = new Intent(Ejercicio3.this,Resultado.class);
                if(resint==num1+num2)
                    intento.putExtra("result","CORRECTO");
                else
                    intento.putExtra("result","INCORRECTO");
                startActivityForResult(intento,2);
            }


        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==2 && resultCode==RESULT_OK){
            corr+=1;
            lblCorr.setText("PREGUNTAS CORRECTAS: " + corr);

        }
        else {
            if (requestCode == 2 && resultCode == RESULT_CANCELED) {
                inc += 1;
                lblInc.setText("INCORRECTAS: " + inc);

            }
        }
        n1.setText((int)(Math.random()*101)+"");
        n2.setText((int)(Math.random()*101)+"");
        result.setText("0");

    }
}
