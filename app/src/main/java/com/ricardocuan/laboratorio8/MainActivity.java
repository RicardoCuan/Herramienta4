package com.ricardocuan.laboratorio8;

import android.content.Intent;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // DECLARACIÓN DE VARIABLES
    private ListView listadatos;
    ArrayList<Datos> Lista;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicialización de variables
        listadatos = (ListView)findViewById(R.id.lsdatos);
        Lista = new ArrayList<Datos>();
        button = findViewById(R.id.button);

        // ListView
        Lista.add(new Datos(1, "BROCOLI", "Posee hierro y proteínas, sustancias que son fundamentales para combatir la anemia.", R.drawable.dbs_1));
        Lista.add(new Datos(2, "PIÑA", "Interfiere en el desarrollo de células ma\u00ADlignas (reduciendo el riesgo de metástasis de algunos tipos de cáncer)", R.drawable.dbs_2));
        Lista.add(new Datos(3, "SANDIA", "Es perfecta para que los músculos se relajen y obtengan energía de nuevo.", R.drawable.dbs_3));
        Lista.add(new Datos(4, "TOMATE", "Debido a que tiene pocas calorías, es un alimento sugerido en las dietas destinadas a bajar de peso.", R.drawable.dbs_4));
        Lista.add(new Datos(5, "AGUACATE", " buen depurativo de la sangre y previene la osteoporosis.", R.drawable.dbs_5));

        Adaptador miadaptador = new Adaptador(getApplicationContext(), Lista);
        listadatos.setAdapter(miadaptador);


        // Button On Click
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent principal_activity = new Intent(MainActivity.this, DiseaseActivity.class);
                startActivity(principal_activity);

            }
        });


    }



}
