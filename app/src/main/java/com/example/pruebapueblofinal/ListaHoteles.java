package com.example.pruebapueblofinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.pruebapueblofinal.Adaptadores.HotelAdaptador;
import com.example.pruebapueblofinal.moldes.MoldeHotel;

import java.util.ArrayList;

public class ListaHoteles extends AppCompatActivity {
    ArrayList<MoldeHotel> listaHoteles = new ArrayList<>();
    RecyclerView recyclerHoteles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);
        recyclerHoteles = findViewById(R.id.listaHoteles);
        recyclerHoteles.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearLista();
        HotelAdaptador adaptador = new HotelAdaptador(listaHoteles);
        recyclerHoteles.setAdapter(adaptador);
    }

    public void crearLista(){
        listaHoteles.add(new MoldeHotel("Hotel Momentos","199000",R.drawable.hjardin2) );
        listaHoteles.add(new MoldeHotel("Hotel Florales del Rio","199100",R.drawable.hjardin3) );
        listaHoteles.add(new MoldeHotel("Hotel La Irlanda","199200",R.drawable.hjardin4 ));
        listaHoteles.add(new MoldeHotel("Hotel Bocato di Cardinale","199300",R.drawable.hjardin5) );
        listaHoteles.add(new MoldeHotel("Hotel El Esmeraldal","199400",R.drawable.hoteljjardin) );
    }

}



