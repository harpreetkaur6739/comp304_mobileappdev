package com.example.harpreetkaur_comp304_lab1_ex2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        //Get Intent
        EditText txtCollege = findViewById(R.id.collegeName);
        EditText txtCampus = findViewById(R.id.campus);
        EditText txtAddress = findViewById(R.id.address);
        EditText txtPostal = findViewById(R.id.postalCode);

        txtCollege.setText(getResources().getString(R.string.college_name));
        txtCampus.setText(getResources().getString(R.string.campus_name));
        txtAddress.setText(getResources().getString(R.string.address));
        txtPostal.setText(getResources().getString(R.string.postal_code));


    }
}
