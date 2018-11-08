package com.example.usuario.practicafisica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculo extends AppCompatActivity {

    Button btnMenu1, btnCalcular, btnCalcular2;
    EditText txtLongitud, txtDiametro, txtEspiras, txtCapa1, txtCapa2,txtCapa3, txtResultado;
    Double indu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);
        iniciar();
        btnMenu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Inicial.class);
                startActivity(i);
            }
        });

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                indu = (0.001 * Integer.parseInt(txtEspiras.getText().toString())/(Integer.parseInt(txtLongitud.getText().toString())
                        +0.45 * Integer.parseInt(txtDiametro.getText().toString())));
                txtResultado.setText(indu + " mH");
            }
        });
    }

    public void iniciar(){
        btnMenu1 = (Button) findViewById(R.id.btnMenu1);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        btnCalcular2 = (Button) findViewById(R.id.btnCalcular2);
        txtLongitud = (EditText) findViewById(R.id.txtLongitud);
        txtDiametro = (EditText) findViewById(R.id.txtDiametro);
        txtEspiras = (EditText) findViewById(R.id.txtEspiras);
        txtCapa1 = (EditText) findViewById(R.id.txtCapa1);
        txtCapa2 = (EditText) findViewById(R.id.txtCapa2);
        txtCapa3 = (EditText) findViewById(R.id.txtCapa3);
        txtResultado = (EditText) findViewById(R.id.txtResultado);

    }
}
