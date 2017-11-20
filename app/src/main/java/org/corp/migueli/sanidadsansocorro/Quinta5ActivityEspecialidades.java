package org.corp.migueli.sanidadsansocorro;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class Quinta5ActivityEspecialidades extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quinta5_especialidades);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //----------------------------------------------------------------------------------

        Switch switchCardiologia= (Switch) findViewById(R.id.switchCardiologia);

        final TextView texto= (android.widget.TextView) findViewById(R.id.textMedicoEspecialidad);
        final ImageView imageViewDoctor = (ImageView) findViewById(R.id.imageViewDoctor);

        switchCardiologia.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {

                // textp.setText(isChecked ? "Si eres un pro" : "No eres un pro");

                if (isChecked){
                    texto.setText("Doctor Jose Plansencia");
                    imageViewDoctor.setImageResource(R.drawable.solodoctor);
                }else {
                    texto.setText("Cardiologia");
                    imageViewDoctor.setImageResource(R.mipmap.ic_crucecita);
                }
            }
        });

        Switch switchNeurocirugia= (Switch) findViewById(R.id.switchNeurocirugia);

        switchNeurocirugia.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {

                // textp.setText(isChecked ? "Si eres un pro" : "No eres un pro");

                if (isChecked){
                    texto.setText("Doctora María Lopez Hernández");
                    imageViewDoctor.setImageResource(R.drawable.solodoctor);
                }else {
                    texto.setText("Neurocirugia");
                    imageViewDoctor.setImageResource(R.mipmap.ic_crucecita);
                }
            }
        });

        Switch switchCirugia= (Switch) findViewById(R.id.switchCirugia);

        switchCirugia.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {

                // textp.setText(isChecked ? "Si eres un pro" : "No eres un pro");

                if (isChecked){
                    texto.setText("Doctor Calos Suarez Naranjo");
                    imageViewDoctor.setImageResource(R.drawable.solodoctor);
                }else {
                    texto.setText("Cirugia");
                    imageViewDoctor.setImageResource(R.mipmap.ic_crucecita);
                }
            }
        });

        Switch switchRadiologia= (Switch) findViewById(R.id.switchRadiologia);

        switchRadiologia.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {

                // textp.setText(isChecked ? "Si eres un pro" : "No eres un pro");

                if (isChecked){
                    texto.setText("Doctor Antonio Sanchez");
                    imageViewDoctor.setImageResource(R.drawable.solodoctor);
                }else {
                    texto.setText("Radiologia");
                    imageViewDoctor.setImageResource(R.mipmap.ic_crucecita);
                }
            }
        });
    }
}
