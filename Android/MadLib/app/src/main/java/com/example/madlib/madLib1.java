package com.example.madlib;

import androidx.appcompat.app.AppCompatActivity;
import androidx.wear.tiles.material.Button;

import android.os.Bundle;
import android.view.View;

public class madLib1 extends AppCompatActivity {

    private Object Button;
    private Object Adjective1;
    private Object Adjective2;
    private Object Adjective3;
    private Object noun;
    private Object Name1;
    private Object name2;
    private Object Occupation1;
    private Object Occupation2;
    private Object partOfBody;
    private Object verb;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad_lib1);
        Button = findViewById(R.id.enterBTN);
        Adjective1 = findViewById(R.id.adjective1);
        Adjective2 = findViewById(R.id.adjective2);
        Adjective3 = findViewById(R.id.adjective3);
        noun = findViewById(R.id.noun);
        Name1 = findViewById(R.id.Name1);



    }
}