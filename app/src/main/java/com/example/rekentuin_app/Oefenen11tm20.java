package com.example.rekentuin_app;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Oefenen11tm20 extends AppCompatActivity {

    public static final String STUUR_EXTRA = "yeetus";
    public static final String MY_PREFS_NAME1 = "Prefs";

    public void goToOef11tm20(View view) {
        SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME1, MODE_PRIVATE);
        if(prefs.contains("name1") && prefs.contains("name2") && prefs.contains("name3") && prefs.contains("name4") && prefs.contains("name5") && prefs.contains("name6") && prefs.contains("name7") && prefs.contains("name8") && prefs.contains("name9") && prefs.contains("name10"))
        {
            Intent intent = new Intent(this, Oefenen11tm20.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Maak eerst de tafels van 1 tot 10", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oefenen11tm20);

        SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME1, MODE_PRIVATE);

        if(prefs.contains("name11")) {
            String name = prefs.getString("name", "No name defined");

            if(prefs.contains("name11")) {
                Button taf = (Button) findViewById(R.id.OEF11);
                taf.setBackgroundColor(Color.parseColor("#1A8AA3"));
            }
            if(prefs.contains("name12")) {
                Button taf = (Button) findViewById(R.id.OEF12);
                taf.setBackgroundColor(Color.parseColor("#1A8AA3"));
            }
            if(prefs.contains("name13")) {
                Button taf = (Button) findViewById(R.id.OEF13);
                taf.setBackgroundColor(Color.parseColor("#1A8AA3"));
            }
            if(prefs.contains("name14")) {
                Button taf = (Button) findViewById(R.id.OEF14);
                taf.setBackgroundColor(Color.parseColor("#1A8AA3"));
            }
            if(prefs.contains("name15")) {
                Button taf = (Button) findViewById(R.id.OEF15);
                taf.setBackgroundColor(Color.parseColor("#1A8AA3"));
            }
            if(prefs.contains("name16")) {
                Button taf = (Button) findViewById(R.id.OEF16);
                taf.setBackgroundColor(Color.parseColor("#1A8AA3"));
            }
            if(prefs.contains("name17")) {
                Button taf = (Button) findViewById(R.id.OEF17);
                taf.setBackgroundColor(Color.parseColor("#1A8AA3"));
            }
            if(prefs.contains("name18")) {
                Button taf = (Button) findViewById(R.id.OEF18);
                taf.setBackgroundColor(Color.parseColor("#1A8AA3"));
            }
            if(prefs.contains("name19")) {
                Button taf = (Button) findViewById(R.id.OEF19);
                taf.setBackgroundColor(Color.parseColor("#1A8AA3"));
            }
            if(prefs.contains("name20")) {
                Button taf = (Button) findViewById(R.id.OEF20);
                taf.setBackgroundColor(Color.parseColor("#1A8AA3"));
            }
        }}
    public void goToSommen11(View view){
        Intent intent = new Intent(this, Oefenen_tafel.class);
        intent.putExtra(STUUR_EXTRA, "11");
        startActivity(intent);
    }

    public void goToSommen12(View view){
        Intent intent = new Intent(this, Oefenen_tafel.class);
        intent.putExtra(STUUR_EXTRA, "12");
        startActivity(intent);
    }

    public void goToSommen13(View view){
        Intent intent = new Intent(this, Oefenen_tafel.class);
        intent.putExtra(STUUR_EXTRA, "13");
        startActivity(intent);
    }

    public void goToSommen14(View view){
        Intent intent = new Intent(this, Oefenen_tafel.class);
        intent.putExtra(STUUR_EXTRA, "14");
        startActivity(intent);
    }

    public void goToSommen15(View view){
        Intent intent = new Intent(this, Oefenen_tafel.class);
        intent.putExtra(STUUR_EXTRA, "15");
        startActivity(intent);
    }

    public void goToSommen16(View view){
        Intent intent = new Intent(this, Oefenen_tafel.class);
        intent.putExtra(STUUR_EXTRA, "16");
        startActivity(intent);
    }

    public void goToSommen17(View view){
        Intent intent = new Intent(this, Oefenen_tafel.class);
        intent.putExtra(STUUR_EXTRA, "17");
        startActivity(intent);
    }

    public void goToSommen18(View view){
        Intent intent = new Intent(this, Oefenen_tafel.class);
        intent.putExtra(STUUR_EXTRA, "18");
        startActivity(intent);
    }

    public void goToSommen19(View view){
        Intent intent = new Intent(this, Oefenen_tafel.class);
        intent.putExtra(STUUR_EXTRA, "19");
        startActivity(intent);
    }

    public void goToSommen20(View view){
        Intent intent = new Intent(this, Oefenen_tafel.class);
        intent.putExtra(STUUR_EXTRA, "20");
        startActivity(intent);
    }

    public void goToOefenen1tm10(View view){
        Intent intent = new Intent(this, Oefenen1tm10.class);
        startActivity(intent);
    }
}

