/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                                CAMPUS LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                             DESARROLLO EN ANDROID "A"
:*
:*                   SEMESTRE: AGO-DIC/2023    HORA: 08-09 HRS
:*
:*                        Splash, pantalla de arranque
:*
:*  Archivo     : SplashActivity.java
:*  Autor       : Alan Yahir Japhet Gómez Mireles     (20130820)
:*  Fecha       : 02/Oct/2023
:*  Compilador  : Android Studio Giraffe | 2022.3.1
:*  Descripción : Se utiliza un splash para mostrar una pantalla durante 2 segundos.
                  Después de ejecutarse, muestra el MainActivity.
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*==========================================================================================
:*
:*------------------------------------------------------------------------------------------*/

package mx.edu.itl.u3imcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);

        // Hacer la transición al MainActivity después de 2 seg.
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Crear el Intent para llamar a MainActivity
                Intent intent = new Intent( SplashActivity.this, MainActivity.class);
                startActivity( intent );
                finish ();
            }
        }, 2000);
    }
}