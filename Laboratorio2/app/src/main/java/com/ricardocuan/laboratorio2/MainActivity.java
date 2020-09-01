package com.ricardocuan.laboratorio2;

import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText etbase, etaltura;
    Button button;
    TextView tvArea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etbase = findViewById(R.id.etbase);
        etaltura = findViewById(R.id.etaltura);
        button =findViewById(R.id.button);
        tvArea = findViewById(R.id.tvArea);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float base = Float.parseFloat(etbase.getText().toString());
                float alt = Float.parseFloat(etaltura.getText().toString());

                float area = base*alt/2;
                String r = String.valueOf(area);

                tvArea.setText("Área del triangulo: " +area);
            }
        });

    }
}
