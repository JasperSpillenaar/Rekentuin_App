package com.example.rekentuin_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Oefenen_tafel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oefenen_tafel);

        //Haalt info van intent op
        Intent intent = getIntent();
        String data = intent.getStringExtra(Oefenen1tm10.STUUR_EXTRA);

        //Titel
        TextView titel = (TextView) findViewById(R.id.titel);
        String showTitel = "Tafel van " + data;
        titel.setText(showTitel);

        //Som gedeelte
        int num = Integer.parseInt(data);
        String r = "";
        for(int i = 1; i < 11; i++){
            int result = (num * i);
            r+= num + " x " + i + " = " + result + "\n";
            TextView yeet = (TextView) findViewById(R.id.tafels);
            yeet.setText(r);
        }
    }
    public void goBack(View view){
        Intent intent = new Intent(this, Oefenen1tm10.class);
        startActivity(intent);
    }
}
