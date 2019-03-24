package com.example.rekentuin_app;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Toetsen11tm20 extends AppCompatActivity {

    public static final String STUUR_EXTRA = "yeetus";
    public static final String MY_PREFS_NAME1 = "Prefs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toetsen11tm20);

        SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME1, MODE_PRIVATE);

        if(prefs.contains("name1")) {
            String name = prefs.getString("name", "No name defined");

            if(prefs.contains("name11")) {
                Button taf = (Button) findViewById(R.id.TOETS11);
                taf.setBackgroundColor(Color.parseColor("#1A8AA3"));
            }
            if(prefs.contains("name12")) {
                Button taf = (Button) findViewById(R.id.TOETS12);
                taf.setBackgroundColor(Color.parseColor("#1A8AA3"));
            }
            if(prefs.contains("name13")) {
                Button taf = (Button) findViewById(R.id.TOETS13);
                taf.setBackgroundColor(Color.parseColor("#1A8AA3"));
            }
            if(prefs.contains("name14")) {
                Button taf = (Button) findViewById(R.id.TOETS14);
                taf.setBackgroundColor(Color.parseColor("#1A8AA3"));
            }
            if(prefs.contains("name15")) {
                Button taf = (Button) findViewById(R.id.TOETS15);
                taf.setBackgroundColor(Color.parseColor("#1A8AA3"));
            }
            if(prefs.contains("name16")) {
                Button taf = (Button) findViewById(R.id.TOETS16);
                taf.setBackgroundColor(Color.parseColor("#1A8AA3"));
            }
            if(prefs.contains("name17")) {
                Button taf = (Button) findViewById(R.id.TOETS17);
                taf.setBackgroundColor(Color.parseColor("#1A8AA3"));
            }
            if(prefs.contains("name18")) {
                Button taf = (Button) findViewById(R.id.TOETS18);
                taf.setBackgroundColor(Color.parseColor("#1A8AA3"));
            }
            if(prefs.contains("name19")) {
                Button taf = (Button) findViewById(R.id.TOETS19);
                taf.setBackgroundColor(Color.parseColor("#1A8AA3"));
            }
            if(prefs.contains("name20")) {
                Button taf = (Button) findViewById(R.id.TOETS20);
                taf.setBackgroundColor(Color.parseColor("#1A8AA3"));
            }
        }
    }
    public void goToToetsen1tm10(View view){
        Intent intent = new Intent(this, Toetsen1tm10.class);
        startActivity(intent);
    }

    public void goToToetsen11(View view){
        Intent intent = new Intent(this, Toetsen.class);
        intent.putExtra(STUUR_EXTRA, "11");
        startActivity(intent);
    }

    public void goToToetsen12(View view){
        Intent intent = new Intent(this, Toetsen.class);
        intent.putExtra(STUUR_EXTRA, "12");
        startActivity(intent);
    }

    public void goToToetsen13(View view){
        Intent intent = new Intent(this, Toetsen.class);
        intent.putExtra(STUUR_EXTRA, "13");
        startActivity(intent);
    }

    public void goToToetsen14(View view){
        Intent intent = new Intent(this, Toetsen.class);
        intent.putExtra(STUUR_EXTRA, "14");
        startActivity(intent);
    }

    public void goToToetsen15(View view){
        Intent intent = new Intent(this, Toetsen.class);
        intent.putExtra(STUUR_EXTRA, "15");
        startActivity(intent);
    }

    public void goToToetsen16(View view){
        Intent intent = new Intent(this, Toetsen.class);
        intent.putExtra(STUUR_EXTRA, "16");
        startActivity(intent);
    }

    public void goToToetsen17(View view){
        Intent intent = new Intent(this, Toetsen.class);
        intent.putExtra(STUUR_EXTRA, "17");
        startActivity(intent);
    }

    public void goToToetsen18(View view){
        Intent intent = new Intent(this, Toetsen.class);
        intent.putExtra(STUUR_EXTRA, "18");
        startActivity(intent);
    }

    public void goToToetsen19(View view){
        Intent intent = new Intent(this, Toetsen.class);
        intent.putExtra(STUUR_EXTRA, "19");
        startActivity(intent);
    }

    public void goToToetsen20(View view){
        Intent intent = new Intent(this, Toetsen.class);
        intent.putExtra(STUUR_EXTRA, "20");
        startActivity(intent);
    }
}
