package com.jger.groupe3.Service;

import static java.lang.Math.random;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Verification extends AppCompatActivity {
    int resultat_calcul = 0;
    TextView Affichage_calcul;
    int Test;

    private void calcul(){
        int PremierNombre;
        int SecondNombre;
        Test = 0;
        if (Test == 0){
            PremierNombre = (int) (random()*20);
            SecondNombre = (int) (random()*20);
            resultat_calcul = PremierNombre + SecondNombre;
            Test = 1;
            majViewCalcul();
        }
    }

    private void majViewCalcul(){
        String textAfficher = "";
        textAfficher = Integer.toString(resultat_calcul);
        Affichage_calcul.setText(textAfficher);
    }
}
