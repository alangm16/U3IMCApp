/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                                CAMPUS LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                             DESARROLLO EN ANDROID "A"
:*
:*                   SEMESTRE: AGO-DIC/2023    HORA: 08-09 HRS
:*
:*                 AcercaDe que contiene información del Usuario
:*
:*  Archivo     : AcercaDe.java
:*  Autor       : Alan Yahir Japhet Gómez Mireles     (20130820)
:*  Fecha       : 02/Oct/2023
:*  Compilador  : Android Studio Giraffe | 2022.3.1
:*  Descripción : Aquí se ejecuta la manera de mostrar la información del usuario.
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*==========================================================================================
:*
:*------------------------------------------------------------------------------------------*/

package mx.edu.itl.u3imcapp;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class AcercaDe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acerca_de);
    }

    // btnAccionClick que reconoce id
    public void btnAccionClick ( View v ) {
        if (v.getId() == R.id.btnSalir ) {
            //Terminar la app
            finish();
        }
    }

}
