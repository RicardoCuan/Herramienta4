package com.ricardocuan.laboratorio5;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Spinner spOperator;
    EditText etValue1, etValor2;
    TextView tvValor1, tvValor2, tvResultado;
    Button btnCalcular;
    float valor1, valor2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalcular = findViewById(R.id.btnCalcular);
        etValue1 = findViewById(R.id.etValue1);
        etValor2 = findViewById(R.id.etValor2);
        tvValor1 = findViewById(R.id.tvValor1);
        tvValor2 = findViewById(R.id.tvValor2);
        tvResultado = findViewById(R.id.tvResultado);
        spOperator = findViewById(R.id.spOperator);

        String[] options = {"Suma", "Resta", "Multiplicar", "Dividir", "Cubo"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android
                .R.layout.simple_spinner_item, options);
        spOperator.setAdapter(adapter);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selec = spOperator.getSelectedItem().toString();
                if (selec.equals("Suma")) {
                    etValor2.setVisibility(View.VISIBLE);
                    String v1 = etValue1.getText().toString();
                    String v2 = etValor2.getText().toString();
                    valor1 = Float.parseFloat(v1);
                    valor2 = Float.parseFloat(v2);
                    float total = valor1+valor2;
                    tvResultado.setText("Suma :" + total);
                } else if (selec.equals("Resta")) {
                    etValor2.setVisibility(View.VISIBLE);
                    String v1 = etValue1.getText().toString();
                    String v2 = etValor2.getText().toString();
                    valor1 = Float.parseFloat(v1);
                    valor2 = Float.parseFloat(v2);
                    float total = valor1 - valor2;
                    tvResultado.setText("Resta :" + total);
                } else if (selec.equals("Multiplicar")) {
                    etValor2.setVisibility(View.VISIBLE);
                    String v1 = etValue1.getText().toString();
                    String v2 = etValor2.getText().toString();
                    valor1 = Float.parseFloat(v1);
                    valor2 = Float.parseFloat(v2);
                    float total = valor1 * valor2;
                    tvResultado.setText("Multiplicación :" + total);
                }  else if (selec.equals("Dividir")) {
                    etValor2.setVisibility(View.VISIBLE);
                    String v1 = etValue1.getText().toString();
                    String v2 = etValor2.getText().toString();
                    valor1 = Float.parseFloat(v1);
                    valor2 = Float.parseFloat(v2);
                    float total = valor1 / valor2;
                    tvResultado.setText("División :" + total);
                } else if (selec.equals("Cubo")) {
                    etValor2.setVisibility(View.INVISIBLE);
                    String v1 = etValue1.getText().toString();
                    valor1 = Float.parseFloat(v1);
                    float total = valor1*valor1*valor1;
                    tvResultado.setText("Cubo :" + total);
                }
            }
        });

    }
}
