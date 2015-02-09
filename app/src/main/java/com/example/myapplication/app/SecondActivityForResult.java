package com.example.myapplication.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;


/**
 * Created by marie-helene on 08/02/15.
 */
public class SecondActivityForResult extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        Button btn1 = (Button) findViewById(R.id.Button1);
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent data = new Intent();
                data.putExtra("returnKey1", "Test de Retour");
                setResult(RESULT_OK, data);
                finish();
            }
        });

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
