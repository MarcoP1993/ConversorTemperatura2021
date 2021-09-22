package com.example.conversortemperatura2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private double centigrados = 0.0;
    private double farenheit = 0.0;
    private double kelvin = 0.0;
    private EditText edt_gradoscentigrados = null;
    private TextView txt_kelvin = null;
    private TextView txt_farenheit= null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_gradoscentigrados = (EditText) findViewById(R.id.edt_grados);
        txt_kelvin = (TextView) findViewById(R.id.txt_gradosKelvin);
        txt_farenheit = (TextView) findViewById(R.id.txt_farenheit);
    }

    public void convertir(View view) {
        String texto = String.valueOf(edt_gradoscentigrados.getText());
        if(texto.isEmpty()){
            Toast.makeText(this,"escribe una cifra", Toast.LENGTH_SHORT).show();
        }else {
            centigrados = Double.valueOf(texto);
            kelvin = centigrados + 273.15;
            farenheit = centigrados * 9 / 5 + 32.0;
            txt_kelvin.setText(String.valueOf(kelvin));
            txt_farenheit.setText(String.valueOf(farenheit));
        }
    }
}