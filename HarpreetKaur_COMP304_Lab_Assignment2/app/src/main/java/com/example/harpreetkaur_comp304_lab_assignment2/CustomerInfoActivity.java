package com.example.harpreetkaur_comp304_lab_assignment2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CustomerInfoActivity extends Activity {

    private ArrayList<String> selectedMenu = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_info);

        selectedMenu = getIntent().getStringArrayListExtra("selectedMenu");
    }

    public void placeOrder(View view){

        HashMap<String, String> customerInfo = new HashMap<String, String>();

        customerInfo.put("name",((EditText)findViewById(R.id.txtName)).getText().toString());
        customerInfo.put("address",((EditText)findViewById(R.id.txtAddress)).getText().toString());
        customerInfo.put("creditCardNum", ((EditText)findViewById(R.id.txtCreditNumber)).getText().toString());
        customerInfo.put("cvv", ((EditText)findViewById(R.id.txtCvv)).getText().toString());
        customerInfo.put("phone", ((EditText)findViewById(R.id.txtPhone)).getText().toString());
        customerInfo.put("cardExpiryDate", ((EditText)findViewById(R.id.txtCardExpiryDate)).getText().toString());

        Intent intent = new Intent(this, CheckOutActivity.class);
        intent.putStringArrayListExtra("selectedMenu", selectedMenu);
        intent.putExtra("customerInfo",customerInfo);
        startActivity(intent);

    }

    public void goBack(View view){
        Intent intent = new Intent(this, FoodMenuActivity.class);
        startActivity(intent);
    }
}
