package com.example.harpreetkaur_comp304_lab1_ex1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){

        EditText text = findViewById(R.id.txtMsg);
        String textMsg = text.getText().toString();

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("message", textMsg);
        startActivity(intent);
    }
}
