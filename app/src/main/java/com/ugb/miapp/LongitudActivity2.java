package com.ugb.miapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class LongitudActivity2 extends AppCompatActivity {
    Button btnd;
    TextView temps;
    Spinner spna;
    conversorlongitudactivity2 miconversors = new conversorlongitudactivity2();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_longitud2);
        btnd = findViewById(R.id.btnConvertir);
        btnd.setOnClickListener(new View.OnClickListener() {
            @Override
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
class conversorlongitudactivity2{
    double[][] valores = {



            {1, 0.1, 0.01, 1e-5, 10, 10000, 1e+7, 1e+10, 5.3996e-6, 6.2137e-6},//longitud


    };
    public double convertir (int opcion, int de, int a, double cantidad){
        return valores [opcion][a] / valores [opcion][de]* cantidad;
    }
}