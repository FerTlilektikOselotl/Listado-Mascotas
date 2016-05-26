package com.example.yoso.mascotas.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yoso.mascotas.R;
import com.example.yoso.mascotas.adapter.MascotaAdaptador;
import com.example.yoso.mascotas.modelos.Mascota;

import java.util.ArrayList;
import java.util.List;

public class PerfilMascotaFragment extends Fragment {

    private RecyclerView listaMascotas;
    private List<Mascota> mascotas;

    public PerfilMascotaFragment() {
    }

    public static PerfilMascotaFragment newInstance() {
        PerfilMascotaFragment fragment = new PerfilMascotaFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_perfil_mascota, container, false);
        listaMascotas = (RecyclerView) view.findViewById(R.id.rvMascotas);

        /*LinearLayoutManager llamada = new LinearLayoutManager(getActivity());
        llamada.setOrientation(LinearLayoutManager.VERTICAL);*/
        listaMascotas.setHasFixedSize(true);
        listaMascotas.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        //listaMascotas.setLayoutManager(llamada);

        inicializarDatos();
        inicializarAdaptador();
        return view;
    }


    public void inicializarDatos(){
        mascotas = new ArrayList<>();
        mascotas.add(new Mascota(R.drawable.alfie, "Canelo", "5"));
        mascotas.add(new Mascota(R.drawable.alfie, "Canelo", "3"));
        mascotas.add(new Mascota(R.drawable.alfie, "Canelo", "1"));
        mascotas.add(new Mascota(R.drawable.alfie, "Canelo", "2"));
        mascotas.add(new Mascota(R.drawable.alfie, "Canelo", "3"));
        mascotas.add(new Mascota(R.drawable.alfie, "Canelo", "3"));
        mascotas.add(new Mascota(R.drawable.alfie, "Canelo", "5"));
        mascotas.add(new Mascota(R.drawable.alfie, "Canelo", "2"));
        mascotas.add(new Mascota(R.drawable.alfie, "Canelo", "4"));
        mascotas.add(new Mascota(R.drawable.alfie, "Canelo", "5"));
        mascotas.add(new Mascota(R.drawable.alfie, "Canelo", "3"));
        mascotas.add(new Mascota(R.drawable.alfie, "Canelo", "1"));
        mascotas.add(new Mascota(R.drawable.alfie, "Canelo", "2"));
        mascotas.add(new Mascota(R.drawable.alfie, "Canelo", "3"));
        mascotas.add(new Mascota(R.drawable.alfie, "Canelo", "3"));
        mascotas.add(new Mascota(R.drawable.alfie, "Canelo", "5"));
        mascotas.add(new Mascota(R.drawable.alfie, "Canelo", "2"));
        mascotas.add(new Mascota(R.drawable.alfie, "Canelo", "4"));
    }

    public MascotaAdaptador adaptador;
    private void inicializarAdaptador(){
        adaptador = new MascotaAdaptador(mascotas,getActivity());
        listaMascotas.setAdapter(adaptador);

    }


}
