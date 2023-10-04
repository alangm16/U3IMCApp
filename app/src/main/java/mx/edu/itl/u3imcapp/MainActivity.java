/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                                CAMPUS LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                             DESARROLLO EN ANDROID "A"
:*
:*                   SEMESTRE: AGO-DIC/2023    HORA: 08-09 HRS
:*
:*                                Cálculo de IMC
:*
:*  Archivo     : MainActivity.java
:*  Autor       : Alan Yahir Japhet Gómez Mireles     (20130820)
:*  Fecha       : 02/Oct/2023
:*  Compilador  : Android Studio Giraffe | 2022.3.1
:*  Descripción : Diseño de los métodos para calcular el IMC.
                  Ejecución del código con los métodos para correr la aplicación.
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*==========================================================================================
:*
:*------------------------------------------------------------------------------------------*/

package mx.edu.itl.u3imcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // btnAccionClick que reconoce id
    public void btnAccionClick ( View v ) {
        if ( v.getId() == R.id.btnCalculaIMC ) {
            EditText editTextPeso = findViewById(R.id.idPeso);
            EditText editTextEstatura = findViewById(R.id.idEstatura);

            // Obtener el texto ingresado en los EditTexts
            String textoPeso = editTextPeso.getText().toString();
            String textoEstatura = editTextEstatura.getText().toString();

            // Convertir el texto a valores numéricos (double)
            float masa = Float.parseFloat(textoPeso);
            float estatura = Float.parseFloat(textoEstatura);
            float RIMC= IMC(masa, estatura);

            String RCond = Condicion(RIMC);

            AlertDialog.Builder builder = new AlertDialog.Builder ( this );
            builder.setTitle("IMCApp");
            builder.setMessage ( "IMC = " +  RIMC + ", su condición de salud es: " + RCond)
                .setPositiveButton ( "Aceptar", new DialogInterface.OnClickListener() {

                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText( MainActivity.this, "Listo", Toast.LENGTH_SHORT).show();
                }
            })
                    .create()
                    .show();
        } else if (v.getId() == R.id.btnAcercaDe ){
            Intent intent = new Intent(this, AcercaDe.class );
            startActivity( intent );
        }
    }

    public float IMC (float masa, float estatura) {
        float IMC = masa / (estatura * estatura);

        return IMC;
    }

    public String Condicion (double IMC) {
        String condicion = "";
        if (IMC < 18.49) {
            condicion = "Peso bajo";
        } else if (IMC >= 18.50 && IMC <= 24.99) {
            condicion = "Peso normal";
        } else if (IMC >= 25 && IMC <= 29.99) {
            condicion = "Sobrepeso";
        } else if (IMC >= 30 && IMC <= 34.99) {
            condicion = "Obesidad leve";
        } else if (IMC>= 35 && IMC<= 39.99) {
            condicion = "Obesidad media";
        } else if (IMC>40) {
            condicion = "Obesidad mórbida";
        }
        return condicion;
    }

}