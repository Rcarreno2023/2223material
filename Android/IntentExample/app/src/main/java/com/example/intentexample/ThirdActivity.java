package com.example.intentexample;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {
    private TextView thirdLBL;
    private Button thirdBTN;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        thirdLBL=findViewById(R.id.thirdLBL);

        String valueOfIntent = getIntent().getStringExtra("user input");
        thirdLBL.setText(valueOfIntent);





    }

}
