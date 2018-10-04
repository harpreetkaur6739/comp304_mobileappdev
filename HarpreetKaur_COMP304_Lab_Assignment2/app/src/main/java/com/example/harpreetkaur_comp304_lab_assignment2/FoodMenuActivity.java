package com.example.harpreetkaur_comp304_lab_assignment2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class FoodMenuActivity extends Activity {

    private String cuisineId;
    private LinearLayout menuLayout;
    CheckBox chkBox;
    private ArrayList<String> selectedMenu = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_menu);

        cuisineId = getIntent().getStringExtra("cuisineId");
        menuLayout = (LinearLayout) findViewById(R.id.menuLayout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //show the menu
        super.onCreateOptionsMenu(menu);
       // Toast.makeText(this, cuisineId, Toast.LENGTH_LONG).show();
        //getMenuInflater().inflate(R.menu.indianrestaurantmenu, menu);
        switch(cuisineId){
            case "American":
                getMenuInflater().inflate(R.menu.americanrestaurantmenu, menu);
                break;
            case "Indian":
                getMenuInflater().inflate(R.menu.indianrestaurantmenu, menu);
                break;
            case "Italian":
                getMenuInflater().inflate(R.menu.italianrestaurantmenu, menu);
                break;
            case "Chinese":
                getMenuInflater().inflate(R.menu.chineserestaurantmenu, menu);
                break;
        }

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        ArrayList<String> menuArray = new ArrayList<String>();

        //handle menu items  y their id
        switch (item.getItemId())
        {
            case R.id.stlouis:
                //displayTextView.setText("You selected start!");
                menuArray = new ArrayList<String> (Arrays.asList(getResources().getStringArray(R.array.stlouis_menu)));
                //Toast.makeText(this, "You selected St Louis!", Toast.LENGTH_LONG).show();
                break;
            case R.id.mcd:
                menuArray = new ArrayList<String>  (Arrays.asList(getResources().getStringArray(R.array.mcd_menu)));
                //Toast.makeText(this, "You selected McDOnalds!", Toast.LENGTH_LONG).show();
                break;
            case R.id.tandooriflame:
                menuArray = new ArrayList<String>  (Arrays.asList(getResources().getStringArray(R.array.tandoori_menu)));
                //Toast.makeText(this, "You selected Tandoori!", Toast.LENGTH_LONG).show();
                break;
            case R.id.brar:
                menuArray = new ArrayList<String>  (Arrays.asList(getResources().getStringArray(R.array.brar_menu)));
                //Toast.makeText(this, "You selected Brar!", Toast.LENGTH_LONG).show();
                break;
            case R.id.hakka:
                menuArray = new ArrayList<String>  (Arrays.asList(getResources().getStringArray(R.array.hakka_menu)));
                //Toast.makeText(this, "You selected Hakka!", Toast.LENGTH_LONG).show();
                break;
            case R.id.mandarin:
                menuArray = new ArrayList<String>  (Arrays.asList(getResources().getStringArray(R.array.mandarin_menu)));
                //Toast.makeText(this, "You selected Mandarin!", Toast.LENGTH_LONG).show();
                break;
            case R.id.papajohn:
                menuArray = new ArrayList<String> (Arrays.asList(getResources().getStringArray(R.array.papajohn_menu)));
                //Toast.makeText(this, "You selected Papa John!", Toast.LENGTH_LONG).show();
                break;
            case R.id.paisano:
                menuArray = new ArrayList<String>  (Arrays.asList(getResources().getStringArray(R.array.paisano_menu)));
                //Toast.makeText(this, "You selected Paisano!", Toast.LENGTH_LONG).show();
                break;

        }

        for(int i=0; i< menuArray.size(); i++){
            chkBox = new CheckBox(this);
            chkBox.setId(i);
            chkBox.setText(menuArray.get(i));
            chkBox.setOnClickListener(buildMenu());
            menuLayout.addView(chkBox);
        }
        return true;
    }

    View.OnClickListener buildMenu(){
        return new View.OnClickListener(){

            @Override
            public void onClick(View view){
                CheckBox chk = (CheckBox) view;
                if(chk.isChecked()){
                    selectedMenu.add(chk.getText().toString());
                }else{
                    selectedMenu.remove(chk.getText().toString());
                }
            }
        };
    }
    public void goToCustomerInfo(View view){
        Intent intent = new Intent(this, CustomerInfoActivity.class);
        intent.putStringArrayListExtra("selectedMenu", selectedMenu);
        startActivity(intent);
    }

    public void goBack(View view){
        Intent intent = new Intent(this, CuisinesActivity.class);
        startActivity(intent);
    }
}
