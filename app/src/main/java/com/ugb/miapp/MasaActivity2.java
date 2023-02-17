package com.ugb.miapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MasaActivity2 extends AppCompatActivity {

    Button btn;
    TextView temp;
    Spinner spn;
    conversorMasaActivity2 miConversor = new conversorMasaActivity2();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masa2);

        btn = findViewById(R.id.btnconvertir);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = (TextView) findViewById(R.id.txtcantidad);
                double cantidad = Double.parseDouble(temp.getText().toString());

                spn = findViewById(R.id.spnde);
                int de = spn.getSelectedItemPosition();

                spn = findViewById(R.id.spna);
                int a = spn.getSelectedItemPosition();

                temp = findViewById(R.id.lblrespuesta);
                temp.setText("Respuesta: "+ miConversor.convertir(0, de, a, cantidad));
            }
        });
    }
}
class conversorMasaActivity2{
    double[][] valores = {



            {1, 1000, 1000000, 1000000000, 1e-12, 10.0  , 2204.62, 35.274, 1.016, 5000000},//Masa

    };
    public double convertir (int opcion, int de, int a, double cantidad){
        return valores [opcion][a] / valores [opcion][de]* cantidad;
    }
}
