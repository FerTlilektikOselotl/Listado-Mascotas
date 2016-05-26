package com.example.yoso.mascotas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.yoso.mascotas.adapter.MascotaAdaptador;
import com.example.yoso.mascotas.modelos.Mascota;

import java.util.ArrayList;
import java.util.List;

public class Favoritos extends AppCompatActivity {

    private RecyclerView listaMascotas;
    private List<Mascota> mascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        setTitle("Favoritos");
        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llamada = new LinearLayoutManager(this);
        llamada.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llamada);

        inicializarDatos();
        inicializarAdaptador();
    }

    public void inicializarDatos(){
        mascotas = new ArrayList<>();

        mascotas.add(new Mascota(R.drawable.copito, "Copito", "3"));
        mascotas.add(new Mascota(R.drawable.alfie, "Alfie", "5"));
        mascotas.add(new Mascota(R.drawable.lucky, "Lucky", "2"));
        mascotas.add(new Mascota(R.drawable.niki, "Niki", "3"));
        mascotas.add(new Mascota(R.drawable.toby, "Toby", "4"));
    }

    public MascotaAdaptador adaptador;
    private void inicializarAdaptador(){
        adaptador = new MascotaAdaptador(mascotas,this);
        listaMascotas.setAdapter(adaptador);
    }
}
