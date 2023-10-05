package com.example.sumarnumeros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sumar(View Vista){

        try{
            EditText valor1=(EditText) findViewById(R.id.valor1);
            int numero1=Integer.parseInt(valor1.getText().toString());

            EditText valor2=(EditText) findViewById(R.id.valor2);
            int numero2=Integer.parseInt(valor2.getText().toString());

            int suma=numero1+numero2;

            TextView mostrar=(TextView)findViewById(R.id.mostrarResultado);
            String cadena=String.valueOf(suma);
            mostrar.setText(cadena);
        }catch(NumberFormatException nfe){
            Toast.makeText(this, "Por favor, introduce un número", Toast.LENGTH_SHORT).show();
        }


    }

}