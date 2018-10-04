package com.example.harpreetkaur_comp304_lab_assignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FinishOrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish_order);
    }

    public void startAgain(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
