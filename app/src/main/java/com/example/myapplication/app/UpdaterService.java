package com.example.myapplication.app;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

/**
 * Created by marie-helene on 09/02/15.
 */
public class UpdaterService extends Service {

    static final String TAG = "centrale";

    public UpdaterService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        //TODO : Return the communication channel to the service
        throw new UnsupportedOperationException("Not Yet Implemented");
    }

    @Override
    public void onCreate() {
        Log.d(TAG, "Service on Create");
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "Service On Destroy");
        super.onDestroy();
    }
}
