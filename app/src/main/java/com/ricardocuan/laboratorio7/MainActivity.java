package com.ricardocuan.laboratorio7;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv3;
    private CheckBox ck1,ck2,ck3, ck4;
    private Button btn;
    private float sum;
    private String resu="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ck1=(CheckBox)findViewById(R.id.ck1);
        ck2=(CheckBox)findViewById(R.id.ck2);
        ck3=(CheckBox)findViewById(R.id.ck3);
        ck4=(CheckBox)findViewById(R.id.ck4);
        tv3=findViewById(R.id.tv3);
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                sum=0;
                if (ck1.isChecked()==true) {sum = sum + 3;}
                if (ck2.isChecked()==true) { sum = sum + 4;}
                if (ck3.isChecked()==true) { sum = (float) (sum + 3.5);}
                if (ck4.isChecked()==true) { sum = (float) (sum + 1.5);}
                resu=" Total: "+ sum;
                tv3.setText(resu);
            }
        });
    }
}
