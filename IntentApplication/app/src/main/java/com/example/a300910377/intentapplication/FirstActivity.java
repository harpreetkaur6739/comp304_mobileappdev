package com.example.a300910377.intentapplication;

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

    public void moveActivity(View v){
        Intent i = new Intent(FirstActivity.this, SecondActivity.class);
        startActivity(i);
    }
}
