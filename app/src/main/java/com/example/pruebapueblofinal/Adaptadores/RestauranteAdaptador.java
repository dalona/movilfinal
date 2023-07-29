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

import java.util.ArrayList;

public class RestauranteAdaptador extends RecyclerView.Adapter<RestauranteAdaptador.viewHolder> {

    //ATRIBUTOS
    public ArrayList<RestauranteMolde> listaRestaurantes;

    //CONSTRUCTOR
    public RestauranteAdaptador(ArrayList<RestauranteMolde> listaRestaurantes) {
        this.listaRestaurantes = listaRestaurantes;
    }

    @NonNull
    @Override
    public RestauranteAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vista= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.moldehotel,null,false);
        return new viewHolder(vista);

    }

    @Override
    public void onBindViewHolder(@NonNull RestauranteAdaptador.viewHolder viewHolder, int i) {
        viewHolder.actualizarDatos(listaRestaurantes.get(i));

    }

    @Override
    public int getItemCount() {

        return  listaRestaurantes.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView nombreresturante;
        TextView descripcionrestaurante;
        TextView rangoprecios;
        ImageView fotorestaurante;

        public viewHolder(View item) {
            super(item);
            fotorestaurante=item.findViewById(R.id.fotorestaurante);
            nombreresturante=item.findViewById(R.id.titulores);
            rangoprecios=item.findViewById(R.id.precioitem);
            descripcionrestaurante=item.findViewById(R.id.tituloplato);
        }

        public void actualizarDatos(RestauranteMolde restauranteMolde) {
            fotorestaurante.setImageResource(restauranteMolde.getFoto());
            nombreresturante.setText(restauranteMolde.getNombre());
            rangoprecios.setText(restauranteMolde.getRangoPrecios());
            descripcionrestaurante.setText(restauranteMolde.getDescripcion());

        }
    }
}