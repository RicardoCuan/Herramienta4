package com.ricardocuan.laboratorio6;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioButton rb1,rb2;
    private ImageView iv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv1= findViewById(R.id.iv1);
        rb1=findViewById(R.id.rb1);
        rb2=findViewById(R.id.rb2);

        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv1.setImageResource(R.drawable.conejo);
                Toast toast1 =
                        Toast.makeText(getApplicationContext(),
                                "¡El conejo come Zanahorias!", Toast.LENGTH_SHORT);

                toast1.show();
            }
        });
        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv1.setImageResource(R.drawable.perro);
                Toast toast1 =
                    Toast.makeText(getApplicationContext(),
                        "¡El perro come Hueso!", Toast.LENGTH_SHORT);

                toast1.show();
            }
        });

    }
}
