package org.corp.migueli.sanidadsansocorro;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static org.corp.migueli.sanidadsansocorro.R.id.buttonBienvenida;
import static org.corp.migueli.sanidadsansocorro.R.id.buttonMostrarResultado;
import static org.corp.migueli.sanidadsansocorro.R.id.textViewBienvenida;

public class SegundaActivity2 extends AppCompatActivity {
    Activity contexto;
    EditText editTextNombre;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda2);

        Intent intent = this.getIntent();

        final EditText editTextNombre= (EditText) findViewById(R.id.editTextNombreIntroducido);
        Button buttonMostrarResultado = (Button) findViewById(R.id.buttonMostrarResultado);

        contexto= this;
        editTextNombre.setError(null);
        final String textoIntroducido = editTextNombre.getText().toString();

        buttonMostrarResultado.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                validar();

            }
            private void validar() {
                editTextNombre.setError(null);
                String textoIntroducido = editTextNombre.getText().toString();

                if (TextUtils.isEmpty(textoIntroducido)) {
                    editTextNombre.setError(getString(R.string.error_campo_obligatorio));
                    editTextNombre.requestFocus();
                    return;
                }
                final EditText editTextNombre= (EditText) findViewById(R.id.editTextNombreIntroducido);
                editTextNombre.setText("Bienvenidos al Hospital San Socorro");


                editTextNombre.setText(textoIntroducido);
                Intent intent= new Intent(contexto, TerceraActivity3.class);
                intent.putExtra("nombre",textoIntroducido);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "Se ha validado correctamente", Toast.LENGTH_SHORT).show();
            }

        });
    }
}
