package com.example.android.favoritecrypto;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //TODO (8) crée la variable txvCrypto de type TextView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO (9) Utilise FindViewById pour avoir une référence de la TextView provenant du layout



        //TODO (10) Utilise la méthode static CryptoBox.getCryptoNames() pour boucler
        // (Boucle for classique ou foreach) dans la liste des cryptos et ajoute toutes les cryptos
        // dans la textview txvCrypto.
        // petit conseil : la méthode append pourra être utile ;)

    }
}