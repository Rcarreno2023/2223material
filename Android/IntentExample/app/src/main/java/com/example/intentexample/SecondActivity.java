package com.example.intentexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private Button second;
    private EditText secondUI;
    private TextView secondLBL;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        second=findViewById(R.id.scondBTN);
        secondLBL=findViewById(R.id.secondLBL);
        secondUI=findViewById(R.id.secondUI);

        String valueOfIntent = getIntent().getStringExtra("user input");
        secondLBL.setText(valueOfIntent);

        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),ThirdActivity.class);

                String ui = valueOfIntent+"\t"+secondUI.getText();

                i.putExtra("user input",ui);
                startActivity(i);

            }
        });


    }
}
