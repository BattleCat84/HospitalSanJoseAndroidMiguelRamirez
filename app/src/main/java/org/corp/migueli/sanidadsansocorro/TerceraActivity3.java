package org.corp.migueli.sanidadsansocorro;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class TerceraActivity3 extends AppCompatActivity {

    Activity contexto;
    Activity contexto2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercera3);

        Intent intent= this.getIntent();
        String nombrePasado= intent.getExtras().getString("nombre");

        TextView textViewNombreIntroducido= (TextView) findViewById(R.id.textViewNombreIntroducido);
        textViewNombreIntroducido.setText(nombrePasado);
        Button buttonIrALaSiguienteActividad = (Button) findViewById(R.id.buttonIrALaSiguienteActividad);

        //---------------------RadioGRoup--------------------------------------

        contexto= this;

        RadioGroup radioGroupSexo= (RadioGroup) findViewById(R.id.radioGroupSexo);

        radioGroupSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId){
                String sexoSeleccionado= null;
                switch(checkedId){
                    case R.id.radioHombre:
                        sexoSeleccionado= "Hombre";
                        break;
                    case R.id.radioMujer:
                        sexoSeleccionado= "Mujer";
                        break;
                }
                Toast.makeText(contexto, "Ha pulsado "+sexoSeleccionado, Toast.LENGTH_SHORT);
            }
        });


        //--------------------- Acción del Boton para ir a la siguiente actividad -------------------------------------
       contexto2= this;

        buttonIrALaSiguienteActividad.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(contexto2, CuartaActivity4.class);
                startActivity(intent);
            }
        });

    }


}
