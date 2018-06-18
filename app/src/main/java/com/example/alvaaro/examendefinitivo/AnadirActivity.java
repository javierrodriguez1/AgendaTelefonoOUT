package com.example.alvaaro.examendefinitivo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class AnadirActivity extends AppCompatActivity{

    Button btnGuardar, btnCancelar;
    EditText etNombre, etNumero;
    ArrayList<Contacto> contactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anadir);

        btnGuardar = findViewById(R.id.btnGuardar);
        btnCancelar = findViewById(R.id.btnCancelar);
        etNombre = findViewById(R.id.etNombre);
        etNumero = findViewById(R.id.etNumero);

        contactos = new ArrayList<>();
        contactos = (ArrayList)getIntent().getExtras().getSerializable("lista");

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Contacto c = new Contacto(etNombre.toString(), etNumero.toString());
                contactos.add(c);

                Intent paso = new Intent(getApplicationContext(), MainActivity.class);
                paso.putExtra("lista", contactos);
                startActivity(paso);
            }
        });
    }
}
