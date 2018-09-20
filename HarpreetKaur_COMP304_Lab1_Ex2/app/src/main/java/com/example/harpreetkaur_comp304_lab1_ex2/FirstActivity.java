package com.example.harpreetkaur_comp304_lab1_ex2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void goToSecond(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
