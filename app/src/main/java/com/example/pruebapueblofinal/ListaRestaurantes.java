package com.example.pruebapueblofinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.pruebapueblofinal.Adaptadores.RestauranteAdaptador;
import com.example.pruebapueblofinal.moldes.MoldeHotel;
import com.example.pruebapueblofinal.moldes.RestauranteMolde;

import java.util.ArrayList;

public class ListaRestaurantes extends AppCompatActivity {
    ArrayList<RestauranteMolde> listaRestaurantes = new ArrayList<>();
    RecyclerView recyclerRestaurantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurantes);
        recyclerRestaurantes = findViewById(R.id.listaRestaurantes);
        recyclerRestaurantes.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearLista();
        RestauranteAdaptador adaptador = new RestauranteAdaptador(listaRestaurantes);
        recyclerRestaurantes.setAdapter(adaptador);
    }

    public void crearLista(){
        listaRestaurantes.add(new RestauranteMolde("Restaurante Murillo","Mondongo","19000-25000",R.drawable.mondongo));
        listaRestaurantes.add(new RestauranteMolde("Restaurante El Pescuezo","Sancocho","19000-25000",R.drawable.sancocho));
        listaRestaurantes.add(new RestauranteMolde("Restaurante La 58","Cazuela de Frijol","19000-25000",R.drawable.cazuela));
        listaRestaurantes.add(new RestauranteMolde("Restaurante La Reina del Carmelo","Sudado de Carne","19000-25000",R.drawable.sudado));
        listaRestaurantes.add(new RestauranteMolde("Restaurante Yuca-Yuca","Patacon con todo","19000-25000",R.drawable.patacon));

    }
}