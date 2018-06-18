package com.example.alvaaro.examendefinitivo;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnAnadir, btnLista;
    public ArrayList<Contacto> contactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAnadir = findViewById(R.id.btnAnadir);
        btnLista = findViewById(R.id.btnListar);

        contactos = new ArrayList<>();
        contactos.add(new Contacto("Javier","681283278"));
        contactos.add(new Contacto("Víctor","567132321"));

        btnAnadir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent paso = new Intent(getApplicationContext(),AnadirActivity.class);
                paso.putExtra("lista", contactos);
                startActivity(paso);
            }
        });

        btnLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent paso = new Intent(getApplicationContext(),ListActivity.class);
                paso.putExtra("lista", contactos);
                startActivity(paso);
            }
        });
    }
}
