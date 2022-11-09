package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static TextView outputLBL;
    static EditText inputTXT;
    Button enterBTN;


    //the first method to be ran -> on screen boot up, goes here
    @Override
    protected void onCreate(Bundle savedInstanceState) {    //equivalent to public static void main(String[] args){}
        super.onCreate(savedInstanceState);                 //inheritance constructor to run the onCreate method
        setContentView(R.layout.activity_main);             //sets the java to look at the xml file

        outputLBL = findViewById(R.id.textView);
        inputTXT = findViewById(R.id.inputBox);
        enterBTN = findViewById(R.id.button);

        enterBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hello();
            }
        });
    }

    public static void hello(){
        //take in user input output helloo persons name
        String ui = String.valueOf(inputTXT.getText());
        outputLBL.setText("Hodwy Haw "+ui);
    }


}