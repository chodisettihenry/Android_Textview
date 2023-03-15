package com.example.textview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    TextView text;
   // Button button;
   // EditText edittext;
  //  String userName;
    CheckBox male;
    CheckBox female;




    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

          male= findViewById(R.id.checkBoxmale);
          female=findViewById(R.id.checkBoxfemale);
          text= findViewById(R.id.textViewgender);
      /*  text = findViewById(R.id.TextViewtext);
        button=findViewById(R.id.buttonOk);
        edittext=findViewById(R.id.editTextTextname);


        text.setText("Welcome to android");
        text.setBackgroundColor(Color.GREEN);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userName= edittext.getText().toString();
                text.setText(userName);


            }
        });*/
          male.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  if(male.isChecked()){
                      text.setText("male");
                      female.setChecked(false);
                  }
                  else {
                      text.setText("what is your gender?");
                  }
              }
          });
          female.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  if (female.isChecked()) {
                      text.setText("female");
                      male.setChecked(false);

                  }
                  else {
                      text.setText("what is your gender?");
                  }
              }
          });

    }
}