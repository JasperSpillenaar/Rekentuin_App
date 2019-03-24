package com.example.rekentuin_app;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

public class Toetsen extends AppCompatActivity {
    private EditText editText10;
    private EditText editText;
    private EditText editText2;
    private EditText editText3;
    private EditText editText4;
    private EditText editText5;
    private EditText editText6;
    private EditText editText7;
    private EditText editText8;
    private EditText editText9;
    private Button controlleer_button;

    public static final String MY_PREFS_NAME1 = "Prefs";
    public static final String MY_PREFS_NAME2 = "Prefs";
    public static final String MY_PREFS_NAME3 = "Prefs";
    public static final String MY_PREFS_NAME4 = "Prefs";
    public static final String MY_PREFS_NAME5 = "Prefs";
    public static final String MY_PREFS_NAME6 = "Prefs";
    public static final String MY_PREFS_NAME7 = "Prefs";
    public static final String MY_PREFS_NAME8 = "Prefs";
    public static final String MY_PREFS_NAME9 = "Prefs";
    public static final String MY_PREFS_NAME10 = "Prefs";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toetsen);

        editText10 = findViewById(R.id.editText10);
        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        editText4 = findViewById(R.id.editText4);
        editText5 = findViewById(R.id.editText5);
        editText6 = findViewById(R.id.editText6);
        editText7 = findViewById(R.id.editText7);
        editText8 = findViewById(R.id.editText8);
        editText9 = findViewById(R.id.editText9);
        controlleer_button = findViewById(R.id.controlleer_button);

        editText10.addTextChangedListener(loginTextWatcher);
        editText.addTextChangedListener(loginTextWatcher);
        editText2.addTextChangedListener(loginTextWatcher);
        editText3.addTextChangedListener(loginTextWatcher);
        editText4.addTextChangedListener(loginTextWatcher);
        editText5.addTextChangedListener(loginTextWatcher);
        editText6.addTextChangedListener(loginTextWatcher);
        editText7.addTextChangedListener(loginTextWatcher);
        editText8.addTextChangedListener(loginTextWatcher);
        editText9.addTextChangedListener(loginTextWatcher);


        //Haalt info van intent op
        Intent intent = getIntent();
        final String data = intent.getStringExtra(Oefenen1tm10.STUUR_EXTRA);

        //Titel
        TextView titelToets = (TextView) findViewById(R.id.titelToets);
        String showTitel = "Tafel van " + data;
        titelToets.setText(showTitel);

        //Som gedeelte
        int num = Integer.parseInt(data);
        String r = "";
        for (int i = 1; i < 11; i++) {
            int som1 = (num * 1);
            int som2 = (num * 2);
            int som3 = (num * 3);
            int som4 = (num * 4);
            int som5 = (num * 5);
            int som6 = (num * 6);
            int som7 = (num * 7);
            int som8 = (num * 8);
            int som9 = (num * 9);
            int som10 = (num * 10);

            final String somt1 = String.valueOf(som1);
            final String somt2 = String.valueOf(som2);
            final String somt3 = String.valueOf(som3);
            final String somt4 = String.valueOf(som4);
            final String somt5 = String.valueOf(som5);
            final String somt6 = String.valueOf(som6);
            final String somt7 = String.valueOf(som7);
            final String somt8 = String.valueOf(som8);
            final String somt9 = String.valueOf(som9);
            final String somt10 = String.valueOf(som10);

            final String[] goedAntwoord1 = {somt1};
            final String[] goedAntwoord2 = {somt2};
            final String[] goedAntwoord3 = {somt3};
            final String[] goedAntwoord4 = {somt4};
            final String[] goedAntwoord5 = {somt5};
            final String[] goedAntwoord6 = {somt6};
            final String[] goedAntwoord7 = {somt7};
            final String[] goedAntwoord8 = {somt8};
            final String[] goedAntwoord9 = {somt9};
            final String[] goedAntwoord10 = {somt10};

            r += num + " x " + i + " = " + "\n";
            TextView yeet = (TextView) findViewById(R.id.tafelsShow);
            yeet.setText(r);

            Button controlleer_button = (Button) findViewById(R.id.controlleer_button);

            controlleer_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    EditText input1 = (EditText) findViewById(R.id.editText10);
                    String inputT1 = input1.getText().toString();

                    EditText input2 = (EditText) findViewById(R.id.editText);
                    String inputT2 = input2.getText().toString();

                    EditText input3 = (EditText) findViewById(R.id.editText2);
                    String inputT3 = input3.getText().toString();

                    EditText input4 = (EditText) findViewById(R.id.editText3);
                    String inputT4 = input4.getText().toString();

                    EditText input5 = (EditText) findViewById(R.id.editText4);
                    String inputT5 = input5.getText().toString();

                    EditText input6 = (EditText) findViewById(R.id.editText5);
                    String inputT6 = input6.getText().toString();

                    EditText input7 = (EditText) findViewById(R.id.editText6);
                    String inputT7 = input7.getText().toString();

                    EditText input8 = (EditText) findViewById(R.id.editText7);
                    String inputT8 = input8.getText().toString();

                    EditText input9 = (EditText) findViewById(R.id.editText8);
                    String inputT9 = input9.getText().toString();

                    EditText input10 = (EditText) findViewById(R.id.editText9);
                    String inputT10 = input10.getText().toString();

                    String[] antwoord1 = {inputT1};
                    String[] antwoord2 = {inputT2};
                    String[] antwoord3 = {inputT3};
                    String[] antwoord4 = {inputT4};
                    String[] antwoord5 = {inputT5};
                    String[] antwoord6 = {inputT6};
                    String[] antwoord7 = {inputT7};
                    String[] antwoord8 = {inputT8};
                    String[] antwoord9 = {inputT9};
                    String[] antwoord10 = {inputT10};

                    // Alle antwoorden
                    // Antwoord 1
                    if (Arrays.deepEquals(antwoord1, goedAntwoord1)) {
                        editText10.setBackgroundColor(Color.GREEN);
                        cijfer++;
                    } else {
                        editText10.setBackgroundColor(Color.RED);
                    }

                    // Antwoord 2
                    if (Arrays.equals(antwoord2, goedAntwoord2)) {
                        editText.setBackgroundColor(Color.GREEN);
                        cijfer++;
                    } else {
                        editText.setBackgroundColor(Color.RED);
                    }

                    // Antwoord 3
                    if (Arrays.deepEquals(antwoord3, goedAntwoord3)) {
                        editText2.setBackgroundColor(Color.GREEN);
                        cijfer++;

                    } else {
                        editText2.setBackgroundColor(Color.RED);
                    }

                    // Antwoord 4
                    if (Arrays.deepEquals(antwoord4, goedAntwoord4)) {
                        editText3.setBackgroundColor(Color.GREEN);
                        cijfer++;
                    } else {
                        editText3.setBackgroundColor(Color.RED);
                    }

                    // Antwoord 5
                    if (Arrays.deepEquals(antwoord5, goedAntwoord5)) {
                        editText4.setBackgroundColor(Color.GREEN);
                        cijfer++;
                    } else {
                        editText4.setBackgroundColor(Color.RED);
                    }

                    // Antwoord 6
                    if (Arrays.deepEquals(antwoord6, goedAntwoord6)) {
                        editText5.setBackgroundColor(Color.GREEN);
                        cijfer++;
                    } else {
                        editText5.setBackgroundColor(Color.RED);
                    }

                    // Antwoord 7
                    if (Arrays.deepEquals(antwoord7, goedAntwoord7)) {
                        editText6.setBackgroundColor(Color.GREEN);
                        cijfer++;
                    } else {
                        editText6.setBackgroundColor(Color.RED);
                    }

                    // Antwoord 8
                    if (Arrays.deepEquals(antwoord8, goedAntwoord8)) {
                        editText7.setBackgroundColor(Color.GREEN);
                        cijfer++;
                    } else {
                        editText7.setBackgroundColor(Color.RED);
                    }

                    // Antwoord 9
                    if (Arrays.deepEquals(antwoord9, goedAntwoord9)) {
                        editText8.setBackgroundColor(Color.GREEN);
                        cijfer++;
                    } else {
                        editText8.setBackgroundColor(Color.RED);
                    }

                    // Antwoord 10
                    if (Arrays.deepEquals(antwoord10, goedAntwoord10)) {
                        editText9.setBackgroundColor(Color.GREEN);
                        cijfer++;
                    } else {
                        editText9.setBackgroundColor(Color.RED);
                    }
                    if (cijfer == 10) {
                        int p = Integer.parseInt(data);

                        if (p == 1) {
                        SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME1, MODE_PRIVATE).edit();
                        editor.putString("name1", data);
                        editor.apply();
                        }
                        if (p == 2) {
                            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME2, MODE_PRIVATE).edit();
                            editor.putString("name2", data);
                            editor.apply();
                        }
                        if (p == 3) {
                            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME3, MODE_PRIVATE).edit();
                            editor.putString("name3", data);
                            editor.apply();
                        }
                        if (p == 4) {
                            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME4, MODE_PRIVATE).edit();
                            editor.putString("name4", data);
                            editor.apply();
                        }
                        if (p == 5) {
                            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME5, MODE_PRIVATE).edit();
                            editor.putString("name5", data);
                            editor.apply();
                        }
                        if (p == 6) {
                            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME6, MODE_PRIVATE).edit();
                            editor.putString("name6", data);
                            editor.apply();
                        }
                        if (p == 7) {
                            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME7, MODE_PRIVATE).edit();
                            editor.putString("name7", data);
                            editor.apply();
                        }
                        if (p == 8) {
                            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME8, MODE_PRIVATE).edit();
                            editor.putString("name8", data);
                            editor.apply();
                        }
                        if (p == 9) {
                            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME9, MODE_PRIVATE).edit();
                            editor.putString("name9", data);
                            editor.apply();
                        }
                        if (p == 10) {
                            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME10, MODE_PRIVATE).edit();
                            editor.putString("name10", data);
                            editor.apply();
                        }
                        if (p == 11) {
                            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME10, MODE_PRIVATE).edit();
                            editor.putString("name11", data);
                            editor.apply();
                        }
                        if (p == 12) {
                            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME10, MODE_PRIVATE).edit();
                            editor.putString("name12", data);
                            editor.apply();
                        }
                        if (p == 13) {
                            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME10, MODE_PRIVATE).edit();
                            editor.putString("name13", data);
                            editor.apply();
                        }
                        if (p == 14) {
                            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME10, MODE_PRIVATE).edit();
                            editor.putString("name14", data);
                            editor.apply();
                        }
                        if (p == 15) {
                            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME10, MODE_PRIVATE).edit();
                            editor.putString("name15", data);
                            editor.apply();
                        }
                        if (p == 16) {
                            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME10, MODE_PRIVATE).edit();
                            editor.putString("name16", data);
                            editor.apply();
                        }
                        if (p == 17) {
                            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME10, MODE_PRIVATE).edit();
                            editor.putString("name17", data);
                            editor.apply();
                        }
                        if (p == 18) {
                            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME10, MODE_PRIVATE).edit();
                            editor.putString("name18", data);
                            editor.apply();
                        }
                        if (p == 19) {
                            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME10, MODE_PRIVATE).edit();
                            editor.putString("name19", data);
                            editor.apply();
                        }
                        if (p == 20) {
                            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME10, MODE_PRIVATE).edit();
                            editor.putString("name20", data);
                            editor.apply();
                        }
                        Toast.makeText(getApplicationContext(), "Je cijfer is een: 10!!", Toast.LENGTH_LONG).show();
                    }
                    if (cijfer == 9){
                        Toast.makeText(getApplicationContext(), "Je cijfer is een: 9!!", Toast.LENGTH_LONG).show();
                    } else if (cijfer == 8){
                        Toast.makeText(getApplicationContext(), "Je cijfer is een: 8!!", Toast.LENGTH_LONG).show();
                    } else if (cijfer == 7){
                        Toast.makeText(getApplicationContext(), "Je cijfer is een: 7!!", Toast.LENGTH_LONG).show();
                    } else if (cijfer == 6){
                        Toast.makeText(getApplicationContext(), "Je cijfer is een: 6!!", Toast.LENGTH_LONG).show();
                    } else if (cijfer == 5){
                        Toast.makeText(getApplicationContext(), "Je cijfer is een: 5!!", Toast.LENGTH_LONG).show();
                    } else if (cijfer == 4){
                        Toast.makeText(getApplicationContext(), "Je cijfer is een: 4!!", Toast.LENGTH_LONG).show();
                    } else if (cijfer == 3){
                        Toast.makeText(getApplicationContext(), "Je cijfer is een: 3!!", Toast.LENGTH_LONG).show();
                    } else if (cijfer == 2){
                        Toast.makeText(getApplicationContext(), "Je cijfer is een: 2!!", Toast.LENGTH_LONG).show();
                    } else if (cijfer == 1){
                        Toast.makeText(getApplicationContext(), "Je cijfer is een: 1!!", Toast.LENGTH_LONG).show();
                    }
                    Button buttongone = (Button) findViewById(R.id.controlleer_button);
                    buttongone.setVisibility(View.GONE);
                }
            });

        }
    }
    private TextWatcher loginTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String input1 = editText10.getText().toString().trim();
            String input2 = editText.getText().toString().trim();
            String input3 = editText2.getText().toString().trim();
            String input4 = editText3.getText().toString().trim();
            String input5 = editText4.getText().toString().trim();
            String input6 = editText5.getText().toString().trim();
            String input7 = editText6.getText().toString().trim();
            String input8 = editText7.getText().toString().trim();
            String input9 = editText8.getText().toString().trim();
            String input10 = editText9.getText().toString().trim();

            controlleer_button.setEnabled(!input1.isEmpty() && !input2.isEmpty() && !input3.isEmpty() && !input4.isEmpty() && !input5.isEmpty() && !input6.isEmpty() && !input7.isEmpty() && !input8.isEmpty() && !input9.isEmpty() && !input10.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
    public void goback(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    int cijfer = 0;
}

