package com.ugb.miapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class AlmacenamientoActivity2 extends AppCompatActivity {
    Button btnd;
    TextView temps;
    Spinner spna;
    conversoralmacenamientoActivity2 miconversors = new conversoralmacenamientoActivity2();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almacenamiento2);
        btnd = findViewById(R.id.btnConvertir);
        btnd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                temps = (TextView) findViewById(R.id.txtcantidad);
                double cantidad = Double.parseDouble(temps.getText().toString());

                spna = findViewById(R.id.spndu);
                int de = spna.getSelectedItemPosition();

                spna = findViewById(R.id.spnq);
                int a = spna.getSelectedItemPosition();

                temps = findViewById(R.id.lblrespuest);
                temps.setText("respuesta: " + miconversors.convertir(0, de, a, cantidad));
            }
        });
    }
}
class conversoralmacenamientoActivity2{
    double[][] valores = {



            {8, 8e-6, 8e-12, 8e-12, 1, 0.001, 1e-6, 1e-9, 1e-12, 1e-15},//Almacenamiento

    };
    public double convertir (int opcion, int de, int a, double cantidad){
        return valores [opcion][a] / valores [opcion][de]* cantidad;
    }
}
