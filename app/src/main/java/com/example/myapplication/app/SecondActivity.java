package com.example.myapplication.app;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;


/**
 * Created by marie-helene on 08/02/15.
 */
public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value1 = extras.getString("Value1");
            if (value1 != null) {
                Log.d("PutExtra", value1);
            }
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

}
