package org.corp.migueli.sanidadsansocorro;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PrimeraMainActivity extends AppCompatActivity {
    Activity contexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primera_main);

        final TextView textViewBienvenida= (TextView) findViewById(R.id.textViewBienvenida);
        Button buttonBienvenida= (Button) findViewById(R.id.buttonBienvenida);

        contexto= this;

        buttonBienvenida.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(contexto, SegundaActivity2.class);
                startActivity(intent);
            }
        });
    }
}
