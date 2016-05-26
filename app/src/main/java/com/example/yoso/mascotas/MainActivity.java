package com.example.yoso.mascotas;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.example.yoso.mascotas.adapter.MascotaAdaptador;
import com.example.yoso.mascotas.adapter.PageAdapter;
import com.example.yoso.mascotas.fragments.PerfilMascotaFragment;
import com.example.yoso.mascotas.fragments.PrincipalFragment;
import com.example.yoso.mascotas.modelos.Mascota;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity  {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        setUpViewPager();

        if(toolbar != null){
            setSupportActionBar(toolbar);
        }

        setTitle("Petagram");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Fotografiar mi mascota", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
   public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
         return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.favoritos){
            Intent intent = new Intent(this, Favoritos.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.contacto_settings) {
            Intent intent = new Intent(this, Contacto.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.acercaDe_settings) {
            Intent intent = new Intent(this, AcercaDe.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    private ArrayList<Fragment> agregarFragments(){
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new PrincipalFragment());
        fragments.add(new PerfilMascotaFragment());
        return fragments;
    }

    public void setUpViewPager(){
        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(), agregarFragments()));
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.mipmap.house);
        tabLayout.getTabAt(1).setIcon(R.mipmap.puppy);
    }

}
