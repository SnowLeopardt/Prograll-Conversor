package com.ugb.miapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btmtd, btmmon, btmmasa, btmlongi, btmvolu, btmtiempo, btmalma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btmmon= findViewById(R.id.btmmon);
        btmmon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MonedaActivity2.class));

            }
        });
        btmvolu= findViewById(R.id.btmvolu);
        btmvolu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),VolumenActivity2.class));
            }
        });
        btmalma= findViewById(R.id.btmalma);
        btmalma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),AlmacenamientoActivity2.class));
            }
        });
        btmlongi= findViewById(R.id.btmlongi);
        btmlongi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),LongitudActivity2.class));
            }
        });
        btmmasa= findViewById(R.id.btmmasa);
        btmmasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MasaActivity2.class));
            }
        });
        btmtiempo= findViewById(R.id.btmtiempo);
        btmtiempo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),TiempoActivity2.class));
            }
        });
        btmtd= findViewById(R.id.btmtd);
        btmtd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),TransferenciaActivity2.class));
            }
        });

    }
}