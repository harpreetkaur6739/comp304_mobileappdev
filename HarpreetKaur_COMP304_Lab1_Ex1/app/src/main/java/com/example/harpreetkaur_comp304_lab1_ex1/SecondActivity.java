package com.example.harpreetkaur_comp304_lab1_ex1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        //get message from first activity and display
        String message = getIntent().getStringExtra("message");
        TextView txtView = findViewById(R.id.message);
        txtView.setText(message);
    }
}
