package com.ricardocuan.laboratorio8;

import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class DiseaseActivity extends AppCompatActivity {

    private ListView listadatos;
    ArrayList<DatosDisease> Lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease);

        listadatos = (ListView)findViewById(R.id.lsdatos);
        Lista = new ArrayList<DatosDisease>();
        Lista.add(new DatosDisease(1, "Gripe y resfriado común", "Son dos infecciones respiratorias virales autolimitadas (es decir, que finalizan sin tratamiento). Tienen una duración de entre tres y cinco días y el cuerpo se encarga de combatirlas y curarlas de forma espontánea. Se manifiestan por dolor de garganta, fiebre, estornudos, tos, malestar general y obstrucción nasal.", R.drawable.db_1));
        Lista.add(new DatosDisease(2, "Rinitis", "Es la inflamación del revestimiento mucoso de la nariz. Sus síntomas incluyen estornudos, picor nasal, congestión nasal y secreción postnasal. Según su causa puede ser alérgica, infecciosa (virus o bacterias) o deberse al mal uso de medicamentos vasoconstrictores nasales (por ejemplo, los descongestionantes). Un tabique nasal desviado, los tumores y los cuerpos extraños también causan enfermedades respiratorias.", R.drawable.db_2));
        Lista.add(new DatosDisease(3, "Rinosinusitis", "Es la afectación de las cavidades paranasales. La rinosinusitis es la complicación de una rinitis y se manifiesta por la emisión abundante de mucosidad líquida por la nariz y opacidad de los senos en radiografía y tomografía axial computarizada (TAC).", R.drawable.db_3));
        Lista.add(new DatosDisease(4, "Faringitis", "Es una infección viral o bacteriana de la garganta. En este último caso, se requiere el uso de antibióticos. La faringitis puede causar fiebre, dolor al tragar, tos y malestar general.", R.drawable.db_4));
        Lista.add(new DatosDisease(5, "Amigdalitis", "Es la inflamación de las amígdalas, un órgano constituido por numerosos nódulos linfáticos ubicado en la garganta. Las amígdalas ayudan a eliminar gérmenes y bacterias, pero cuando se inflaman causan dificultad para deglutir, dolor de oído, fiebre, dolor de cabeza y de garganta.", R.drawable.db_5));
        Lista.add(new DatosDisease(6, "Bronquitis", "Consiste en una irritación e inflamación de los bronquios, lo cual provoca el estrechamiento de las vías respiratorias, cierta dificultad para respirar y la acumulación de moco, además de tos. La principal causa de la bronquitis es el humo del tabaco, así como la exposición a gases industriales o aire contaminado.", R.drawable.db_6));
        Lista.add(new DatosDisease(7, "Enfisema pulmonar", "Patología pulmonar que causa la destrucción progresiva de los vasos sanguíneos en los pulmones y alvéolos. En efecto, los alvéolos son cavidades muy pequeñas en forma de pequeñas bolsas situadas en el extremo de un bronquiolo. Son las ramificaciones más finas de los bronquios. Las personas con enfisema tienen, por lo general, problemas para respirar durante el ejercicio y el tabaquismo es la causa más frecuente.", R.drawable.db_7));
        Lista.add(new DatosDisease(8, "Asma", "Enfermedad respiratoria crónica muy frecuente en los niños, aunque también afecta a los adultos. El asma provoca la inflamación de los bronquios y dificulta las tareas del resto del sistema respiratorio. Las personas asmáticas experimentan insomnio, fatiga, dificultad para respirar, tos, silbidos en el pecho y problemas para realizar las tareas cotidianas.", R.drawable.db_8));

        AdapterDisease miadaptador = new AdapterDisease(getApplicationContext(), Lista);
        listadatos.setAdapter(miadaptador);
    }
}
