package com.ricardocuan.laboratorio3;

import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etbase, etaltura;
    ImageButton imgbtn;
    TextView tvArea;
    private Object listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etbase = findViewById(R.id.etbase);
        etaltura = findViewById(R.id.etaltura);
        imgbtn =findViewById(R.id.imgbtn);
        tvArea = findViewById(R.id.tvArea);

        imgbtn.setOnClickListener(new View.OnClickListener() {
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
