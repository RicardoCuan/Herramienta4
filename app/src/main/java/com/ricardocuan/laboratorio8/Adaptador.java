package com.ricardocuan.laboratorio8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adaptador extends BaseAdapter {

    // Variables
    Context contexto;
    List<Datos> ListaObjetos;

    // Constructor
    public Adaptador(Context contexto, List<Datos> listaObjetos) {
        this.contexto = contexto;
        ListaObjetos = listaObjetos;
    }

    public int getCount() {
        return ListaObjetos.size();
    }

    @Override
    public Object getItem(int position) {
        return ListaObjetos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View vista = convertView;
        LayoutInflater inflate = LayoutInflater.from(contexto);
        vista= inflate.inflate(R.layout.item, null);

        ImageView imagen = (ImageView)vista.findViewById(R.id.img1);
        TextView titulo  = (TextView)vista.findViewById(R.id.txttitulo);
        TextView detalle = (TextView)vista.findViewById(R.id.txtcontenido);

        titulo.setText(ListaObjetos.get(position).getTitulo().toString());
        detalle.setText(ListaObjetos.get(position).getDetalle());
        imagen.setImageResource(ListaObjetos.get(position).getImagen());

        return vista;
    }
}
