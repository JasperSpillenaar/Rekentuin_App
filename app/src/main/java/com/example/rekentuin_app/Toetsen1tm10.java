package com.example.rekentuin_app;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Toetsen1tm10 extends AppCompatActivity {

    public static final String STUUR_EXTRA = "yeetus";
    public static final String MY_PREFS_NAME1 = "Prefs";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toetsen1tm10);

        SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME1, MODE_PRIVATE);

        if(prefs.contains("name1")) {
            String name = prefs.getString("name", "No name defined");

        if(prefs.contains("name1")) {
            Button taf = (Button) findViewById(R.id.button26);
            taf.setBackgroundColor(Color.parseColor("#1A8AA3"));
        }
        if(prefs.contains("name2")) {
            Button taf = (Button) findViewById(R.id.button27);
            taf.setBackgroundColor(Color.parseColor("#1A8AA3"));
        }
        if(prefs.contains("name3")) {
            Button taf = (Button) findViewById(R.id.button28);
            taf.setBackgroundColor(Color.parseColor("#1A8AA3"));
        }
        if(prefs.contains("name4")) {
            Button taf = (Button) findViewById(R.id.button29);
            taf.setBackgroundColor(Color.parseColor("#1A8AA3"));
        }
        if(prefs.contains("name5")) {
            Button taf = (Button) findViewById(R.id.button33);
            taf.setBackgroundColor(Color.parseColor("#1A8AA3"));
        }
        if(prefs.contains("name6")) {
            Button taf = (Button) findViewById(R.id.button36);
            taf.setBackgroundColor(Color.parseColor("#1A8AA3"));
        }
        if(prefs.contains("name7")) {
            Button taf = (Button) findViewById(R.id.button31);
            taf.setBackgroundColor(Color.parseColor("#1A8AA3"));
        }
        if(prefs.contains("name8")) {
            Button taf = (Button) findViewById(R.id.button34);
            taf.setBackgroundColor(Color.parseColor("#1A8AA3"));
        }
        if(prefs.contains("name9")) {
            Button taf = (Button) findViewById(R.id.button37);
            taf.setBackgroundColor(Color.parseColor("#1A8AA3"));
        }
        if(prefs.contains("name10")) {
            Button taf = (Button) findViewById(R.id.button35);
            taf.setBackgroundColor(Color.parseColor("#1A8AA3"));
        }
          }
    }

    public void goToTafels11tm20(View view) {
        SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME1, MODE_PRIVATE);
        if(prefs.contains("name1") && prefs.contains("name2") && prefs.contains("name3") && prefs.contains("name4") && prefs.contains("name5") && prefs.contains("name6") && prefs.contains("name7") && prefs.contains("name8") && prefs.contains("name9") && prefs.contains("name10"))
        {
            Intent intent = new Intent(this, Toetsen11tm20.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Maak eerst de tafels van 1 tot 10", Toast.LENGTH_LONG).show();
        }
    }
    public void goToHome(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void goToToetsen1(View view){
        Intent intent = new Intent(this, Toetsen.class);
        intent.putExtra(STUUR_EXTRA, "1");
        startActivity(intent);
    }

    public void goToSommen2(View view){
        Intent intent = new Intent(this, Toetsen.class);
        intent.putExtra(STUUR_EXTRA, "2");
        startActivity(intent);
    }

    public void goToSommen3(View view){
        Intent intent = new Intent(this, Toetsen.class);
        intent.putExtra(STUUR_EXTRA, "3");
        startActivity(intent);
    }

    public void goToSommen4(View view){
        Intent intent = new Intent(this, Toetsen.class);
        intent.putExtra(STUUR_EXTRA, "4");
        startActivity(intent);
    }

    public void goToSommen5(View view){
        Intent intent = new Intent(this, Toetsen.class);
        intent.putExtra(STUUR_EXTRA, "5");
        startActivity(intent);
    }

    public void goToSommen6(View view){
        Intent intent = new Intent(this, Toetsen.class);
        intent.putExtra(STUUR_EXTRA, "6");
        startActivity(intent);
    }

    public void goToSommen7(View view){
        Intent intent = new Intent(this, Toetsen.class);
        intent.putExtra(STUUR_EXTRA, "7");
        startActivity(intent);
    }

    public void goToSommen8(View view){
        Intent intent = new Intent(this, Toetsen.class);
        intent.putExtra(STUUR_EXTRA, "8");
        startActivity(intent);
    }

    public void goToSommen9(View view){
        Intent intent = new Intent(this, Toetsen.class);
        intent.putExtra(STUUR_EXTRA, "9");
        startActivity(intent);
    }

    public void goToSommen10(View view){
        Intent intent = new Intent(this, Toetsen.class);
        intent.putExtra(STUUR_EXTRA, "10");
        startActivity(intent);
    }
}
