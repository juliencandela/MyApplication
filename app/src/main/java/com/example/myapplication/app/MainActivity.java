package com.example.myapplication.app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    static final String TAG = "TestActivityCycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "On Destroy");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "On Pause");
        super.onPause();
    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "On Restart");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "On Resume");
        super.onResume();
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "On Start");
        super.onStart();
    }
}
