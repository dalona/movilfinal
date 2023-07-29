package com.example.pruebapueblofinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.pruebapueblofinal.Adaptadores.RestauranteAdaptador;
import com.example.pruebapueblofinal.Adaptadores.SitioAdaptador;
import com.example.pruebapueblofinal.moldes.MoldeHotel;
import com.example.pruebapueblofinal.moldes.RestauranteMolde;
import com.example.pruebapueblofinal.moldes.SitioMolde;

import java.util.ArrayList;

public class ListaSitios extends AppCompatActivity {
    ArrayList<SitioMolde> listaSitios = new ArrayList<>();
    RecyclerView recyclerSitios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_sitios);
        recyclerSitios = findViewById(R.id.listaSitios;
        recyclerSitios.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearLista();
        SitioAdaptador adaptador = new RestauranteAdaptador(listaSitios);
        recyclerSitios.setAdapter(SitioAdaptador);
    }

    public void crearLista(){
        listaSitios.add(new SitioMolde(R.drawable.cueva,"Cueva del Esplendor","448-88-425","180000"));
        listaSitios.add(new SitioMolde(R.drawable.granja,"Granja La Paturra","448-88-425","45000"));
        listaSitios.add(new SitioMolde(R.drawable.aserrio,"Aserrio Miranda","448-88-425","27500"));
        listaSitios.add(new SitioMolde(R.drawable.caballeriza,"Caballeceria San Jose","448-88-425","25000"));
        listaSitios.add(new SitioMolde(R.drawable.caballeriza,"Hacienda Balandu","448-88-425","250000"));

    }
}