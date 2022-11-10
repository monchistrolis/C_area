package com.example.calculadordearea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvVal1;
    private TextView tvResultado;
    private Spinner spEleccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //asiignacion de variables a los campos del layout
        tvVal1 = findViewById(R.id.inValor);
        tvResultado = findViewById(R.id.twResultado);
        spEleccion = findViewById(R.id.inOpcion);
        //creacion del array de opciones
        String[] Opciones ={"Seleccione una Opción","Area","Perimetro"};
        //generar el adaptador
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, Opciones);
        //genera la opcion
        spEleccion.setAdapter(adapter);
    }
    //creamos parametro View v
    public void calcular(View v){
        String op=spEleccion.getSelectedItem().toString();
        double x = Double.parseDouble(tvVal1.getText().toString());
        //swith con las opciones correspondientes
        //1 calcular k/h
        switch (op){
            case "Area":
                tvResultado.setText("El Area del circulo es de : "+Math.PI * Math.pow(x, 2));
                break;
            case "Perimetro":
                tvResultado.setText(" El perimetro del circulo es : "+2 * Math.PI * x);
                break;
        }
    }
}