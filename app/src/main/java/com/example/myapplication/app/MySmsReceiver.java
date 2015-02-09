package com.example.myapplication.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by marie-helene on 09/02/15.
 */
public class MySmsReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Message nouveau reçu tu as", Toast.LENGTH_LONG).show();

    }
}
