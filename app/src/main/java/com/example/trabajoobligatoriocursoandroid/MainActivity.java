package com.example.trabajoobligatoriocursoandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;



public class MainActivity extends AppCompatActivity {

    Button botonmapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       
        RecyclerView recyclerViewNegocio = findViewById(R.id.recyclerNegocios);
        recyclerViewNegocio.setLayoutManager(new LinearLayoutManager(this));

        RecyclerViewAdapter adaptadorNegocios = new RecyclerViewAdapter(obtenerNegocios());
        recyclerViewNegocio.setAdapter(adaptadorNegocios);


    }

    public List<Negocios> obtenerNegocios(){
        List<Negocios> negocios=new ArrayList<>();
        negocios.add(new Negocios("APP INFORMÁTICA","PORTÁTIL HP 400€",R.drawable.appinformatica));
        negocios.add(new Negocios("ÓPTICA PAVÓN","GAFAS DE SOL RAYBAN 80€",R.drawable.opticapavon));
        negocios.add(new Negocios("MERCAZAPATOS","SANDALIAS 20€",R.drawable.mercazapatos));
        negocios.add(new Negocios("LIBRERÍA A ESCOLMA","NO HAY OFERTAS",R.drawable.libreriaaescolma));
        negocios.add(new Negocios("PAPELERÍA OFFICE CENTER","NO HAY OFERTAS",R.drawable.officecenter));

        return negocios;

    }
}