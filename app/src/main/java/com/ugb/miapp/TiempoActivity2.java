package com.ugb.miapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class TiempoActivity2 extends AppCompatActivity {

    Button btn;
    TextView temp;
    Spinner spn;
    conversorTiempoActivity2 miConversor = new conversorTiempoActivity2();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiempo2);

        btn = findViewById(R.id.btnConvertir);
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
class conversorTiempoActivity2{
    double[][] valores = {

            {1, 1e-6, 1e-9, 1e-12, 1.6667e-14, 2.7778e-16, 1.1574e-17, 1.6534e-18, 3.8052e-19, 3.171e-20 },//Tiempo
    };
    public double convertir (int opcion, int de, int a, double cantidad){
        return valores [opcion][a] / valores [opcion][de]* cantidad;
    }
}