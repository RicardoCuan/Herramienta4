package com.ricardocuan.laboratorio4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog;
import android.os.Bundle;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView tv4;
    ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        tv4=findViewById(R.id.tv4);
        img1=findViewById(R.id.img1);
        alertDialogBuilder.setTitle("Mi Imagen");

        alertDialogBuilder
            .setMessage("Hola Pedro, ¿Deseas ver una imagen de futbol?")
            .setCancelable(false)
            .setPositiveButton("Si",new DialogInterface.OnClickListener()
            {
                public void onClick(DialogInterface dialog,int id) {
                    img1.setVisibility(View.VISIBLE);
                }
            })
            .setNegativeButton("No",new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog,int id) {
                    dialog.cancel();
                }
            }).create().show();
    }
}
