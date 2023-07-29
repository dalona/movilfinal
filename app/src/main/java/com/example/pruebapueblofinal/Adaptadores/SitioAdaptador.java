package com.example.pruebapueblofinal.Adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pruebapueblofinal.R;
import com.example.pruebapueblofinal.moldes.MoldeHotel;
import com.example.pruebapueblofinal.moldes.RestauranteMolde;
import com.example.pruebapueblofinal.moldes.SitioMolde;

import java.util.ArrayList;

public class SitioAdaptador extends RecyclerView.Adapter<SitioAdaptador.viewHolder> {

    //ATRIBUTOS
    public ArrayList<SitioMolde> listaSitios;

    //CONSTRUCTOR
    public SitioAdaptador(ArrayList<SitioMolde> listaSitios) {
        this.listaSitios = listaSitios;
    }

    @NonNull
    @Override
    public SitioAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vista= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.moldehotel,null,false);
        return new viewHolder(vista);

    }

    @Override
    public void onBindViewHolder(@NonNull RestauranteAdaptador.viewHolder viewHolder, int i) {
        viewHolder.actualizarDatos(listaSitios.get(i));

    }

    @Override
    public int getItemCount() {

        return  listaSitios.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView fotositio;

        TextView nombresitio;

        TextView descripcionsitio;

        TextView preciositio;


        public viewHolder(View item) {
            super(item);
            fotositio=item.findViewById(R.id.fotositio);
            nombresitio=item.findViewById(R.id.nombresitio);
            preciositio=item.findViewById(R.id.precio);
            descripcionsitio=item.findViewById(R.id.tituloplato);
        }

        public void actualizarDatos(SitioMolde sitioMolde) {
            fotositio.setImageResource(sitioMolde.getFoto());
            nombresitio.setText(sitioMolde.getNombre());
            preciositio.setText(sitioMolde.getPrecio());
            descripcionsitio.setText(sitioMolde.getTelefono());

        }
    }
}