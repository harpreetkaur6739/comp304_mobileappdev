package com.example.a300910377.resourcesapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //defining java reference for text view
        TextView text1= findViewById(R.id.textView1);
        String text = getResources().getString(R.string.hello);
        text1.setText(text);
    }
}
