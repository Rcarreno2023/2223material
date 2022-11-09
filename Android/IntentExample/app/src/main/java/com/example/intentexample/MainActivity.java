package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button first;
    private EditText firstInformation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first = findViewById(R.id.firstBTN);
        firstInformation = findViewById(R.id.firstUI);

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ui = String.valueOf(firstInformation.getText());
                Intent i = new Intent(MainActivity.this,SecondActivity.class);




                i.putExtra("user input",ui);

                startActivity(i);
            }
        });

    }
}