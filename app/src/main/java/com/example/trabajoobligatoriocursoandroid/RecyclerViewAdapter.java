package com.example.trabajoobligatoriocursoandroid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter  extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_negocio,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.negocio.setText(negociosLista.get(position).getNegocio());
        holder.ofertas.setText(negociosLista.get(position).getOfertas());
        holder.fotoNegocio.setImageResource(negociosLista.get(position).getImgNegocio());

    }

    @Override
    public int getItemCount() {
        return negociosLista.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView negocio,ofertas;
        ImageView fotoNegocio;

        public ViewHolder( View itemView) {
            super(itemView);
            negocio= itemView.findViewById(R.id.nombre_negocio);
            ofertas= itemView.findViewById(R.id.informacion_negocio);
            fotoNegocio= itemView.findViewById(R.id.imgNegocio);

        }
    }

    public List<Negocios> negociosLista;

    public RecyclerViewAdapter(List<Negocios> negociosLista) {
        this.negociosLista = negociosLista;
    }


}
