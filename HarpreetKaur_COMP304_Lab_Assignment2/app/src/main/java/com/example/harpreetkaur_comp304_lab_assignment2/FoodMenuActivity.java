package com.example.harpreetkaur_comp304_lab_assignment2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class FoodMenuActivity extends Activity {

    private String cuisineId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_menu);
        cuisineId = getIntent().getStringExtra("cuisineId");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        //show the menu
        switch(cuisineId){
            case "@+id/rdAmerican":
                getMenuInflater().inflate(R.menu.indianrestaurantmenu, menu);
                break;
            case "@+id/rdIndian":
                getMenuInflater().inflate(R.menu.indianrestaurantmenu, menu);
                break;
            case "@+id/rdItalian":
                getMenuInflater().inflate(R.menu.indianrestaurantmenu, menu);
                break;
            case "@+id/rdChinese":
                getMenuInflater().inflate(R.menu.indianrestaurantmenu, menu);
                break;
        }

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        //handle menu items  y their id
        switch (item.getItemId())
        {
            case R.id.start:
                //displayTextView.setText("You selected start!");
                Toast.makeText(this, "You selected start!", Toast.LENGTH_LONG).show();
                break;
            case R.id.accel:
                Toast.makeText(this, "You selected speed up!", Toast.LENGTH_LONG).show();
                break;
            case R.id.stop: Toast.makeText(this, "You selected stop!", Toast.LENGTH_LONG).show();
                break;
        }
        return true;
    }
}
