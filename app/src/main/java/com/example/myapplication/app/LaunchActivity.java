package com.example.myapplication.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;


public class LaunchActivity extends Activity {

    static final String TAG = "TestActivityCycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent monIntent = new Intent(LaunchActivity.this, SecondActivity.class);
                startActivity(monIntent);
            }
        });
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
