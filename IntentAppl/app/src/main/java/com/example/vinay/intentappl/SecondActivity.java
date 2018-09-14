package com.example.vinay.intentappl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent(); //Return the intent that started this activity

        String message = intent.getStringExtra("Message");

        EditText editTxt = findViewById(R.id.editText2);

        editTxt.setText(message);
    }
}
