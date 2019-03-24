package com.example.rekentuin_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToOefenen1tm10(View view){
        Intent intent = new Intent(this, Oefenen1tm10.class);
        startActivity(intent);
    }

    public void goToToetsen1tm10(View view){
        Intent intent = new Intent(this, Toetsen1tm10.class);
        startActivity(intent);
    }
}
