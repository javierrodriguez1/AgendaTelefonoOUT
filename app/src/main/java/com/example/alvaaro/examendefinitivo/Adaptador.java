package com.example.alvaaro.examendefinitivo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {

    ArrayList<Contacto> contactos;
    Context contexto;

    public Adaptador(ArrayList<Contacto> contactos, Context contexto) {
        this.contactos = contactos;
        this.contexto = contexto;
    }

    @Override
    public int getCount() {
        return contactos.size();
    }

    @Override
    public Object getItem(int position) {
        return contactos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int i, View view, final ViewGroup viewGroup){
       // View vista = view;
        LayoutInflater inflate = LayoutInflater.from(contexto);
        view = inflate.inflate(R.layout.item, null);

        ImageView imagen = (ImageView)view.findViewById(R.id.imageView);
        TextView titulo = (TextView) view.findViewById(R.id.tvNombre);
        TextView numero = (TextView)view.findViewById(R.id.tvNumero);
        ImageButton ibEliminar = view.findViewById(R.id.imBorrar);
        ImageButton ibLlamada = view.findViewById(R.id.ibLlamar);
        ImageButton ibMensaje = view.findViewById(R.id.ibMensaje);

        titulo.setText(contactos.get(i).getNombre());
        numero.setText(contactos.get(i).getNumero());
        imagen.setImageResource(R.drawable.avatar);
        ibEliminar.setImageResource(R.drawable.eliminar);
        ibLlamada.setImageResource(R.drawable.llamada);
        ibMensaje.setImageResource(R.drawable.sms);

        ibEliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ListView)viewGroup).performItemClick(view,i,0);
            }
        });

        ibLlamada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ListView)viewGroup).performItemClick(view,i,0);
            }
        });

        ibMensaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ListView)viewGroup).performItemClick(view,i,0);
            }
        });


        return view;
    }
}
