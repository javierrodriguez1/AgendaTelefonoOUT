package com.example.alvaaro.examendefinitivo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity{

    ListView lvAgenda;
    ArrayList<Contacto> contactos;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        lvAgenda = findViewById(R.id.lvAgenda);

        contactos = new ArrayList<>();
        contactos = (ArrayList)getIntent().getExtras().getParcelableArrayList("lista");

        Adaptador miAdaptador  = new Adaptador(contactos, getApplicationContext());
        lvAgenda.setAdapter(miAdaptador);

    }
}
