package com.example.harpreetkaur_comp304_lab_assignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class CheckOutActivity extends AppCompatActivity {

    HashMap<String, String> customerInfo = new HashMap<String, String>();
    private ArrayList<String> selectedMenu = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out);

        customerInfo = (HashMap<String, String>) getIntent().getSerializableExtra("customerInfo");
        selectedMenu = getIntent().getStringArrayListExtra("selectedMenu");
        showCheckoutSummary();
    }

    public void showCheckoutSummary(){
        TextView txtOrderDetails = findViewById(R.id.txtOrderDetails);
        txtOrderDetails.setText(selectedMenu.toString());

        TextView txtCustomerDetails = findViewById(R.id.txtCustomerDetail);
        txtCustomerDetails.setText(customerInfo.values().toString());
    }

    public void goBack(View view){
        Intent intent = new Intent(this, CustomerInfoActivity.class);
        startActivity(intent);
    }

    public void finishOrder(View view){
        Intent intent = new Intent(this, FinishOrderActivity.class);
        startActivity(intent);
    }
}
