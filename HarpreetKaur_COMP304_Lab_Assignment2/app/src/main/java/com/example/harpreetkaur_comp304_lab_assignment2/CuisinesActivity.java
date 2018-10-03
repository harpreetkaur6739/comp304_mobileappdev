package com.example.harpreetkaur_comp304_lab_assignment2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class CuisinesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuisines);
    }

    public void next(View view){
        RadioGroup rdGroup = (RadioGroup) findViewById(R.id.rdgCuisines);
        int checkedId = rdGroup.getCheckedRadioButtonId();
        if(checkedId!=-1){
            RadioButton rdbCuisine = (RadioButton) findViewById(checkedId);

            Intent intent = new Intent(this, FoodMenuActivity.class);
            intent.putExtra("cuisineId",rdbCuisine.getId());
            startActivity(intent);
        }else {
            Toast.makeText(getApplicationContext(), "Please select a cuisine first!", Toast.LENGTH_LONG).show();
        }
    }
}
