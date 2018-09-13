package com.example.a300910377.activitycycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends Activity {

    String tag = "Life Cycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(tag,"Inside onCreate method");

        //Show text temporarily and then it disappears
        Toast.makeText(getApplicationContext(), tag+"In onCreateEvent", Toast.LENGTH_LONG).show();

    }

    public void onStart(){
        super.onStart();
        Log.d(tag,"\nInside onStart method");
    }

    public void onRestart(){
        super.onRestart();
        Log.d(tag,"Inside onRestart method");
    }

    public void onResume(){
        super.onResume();
        Log.d(tag,"Inside onResume method");
    }

    public void onPause(){
        super.onPause();
        Log.d(tag,"Inside onPause method");
    }

    public void onStop(){
        super.onStop();
    }

    public void onDestroy(){
        super.onDestroy();
    }
}
