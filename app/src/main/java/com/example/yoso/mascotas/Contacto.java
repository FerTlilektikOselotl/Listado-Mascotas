package com.example.yoso.mascotas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Contacto extends AppCompatActivity {

    private Button btn_enviar;
    private EditText nombre, correo, mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        btn_enviar = (Button) findViewById(R.id.btn_enviar);
        nombre = (EditText) findViewById(R.id.nombre);
        correo = (EditText) findViewById(R.id.correo);
        mensaje = (EditText) findViewById(R.id.mensaje);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        setTitle("Contacto");

        btn_enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*nombre.getText().toString()
                correo.getText().toString()
                mensaje.getText().toString()*/
            }
        });
    }
}
