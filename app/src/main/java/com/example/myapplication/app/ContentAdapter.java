package com.example.myapplication.app;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by marie-helene on 09/02/15.
 */
public class ContentAdapter extends Activity {

    private static final String TAG = "Content Adapter";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "Lancement activity");

        Uri uri = ContactsContract.Contacts.CONTENT_URI;
        String[] projection = null;
        String selection = null;
        String[] selectionArgs = null;
        String sortOrder = null;
        ContentResolver cr = getContentResolver();
        Cursor cur = cr.query(uri, projection, selection, selectionArgs,
                sortOrder);
        if (cur.getCount() > 0) {
            while (cur.moveToNext()) {
                String id = cur.getString(cur
                        .getColumnIndex(ContactsContract.Contacts._ID));
                String displayName = cur
                        .getString(cur
                                .getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME));
                Log.i(TAG, id + " : " + displayName);
            }
        } else {
            Log.i(TAG, "Cursor empty");
        }

        setContentView(R.layout.contact_activity);

        Button btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contacts = new Intent(android.content.Intent.ACTION_VIEW,
                        ContactsContract.Contacts.CONTENT_URI);
                startActivity(contacts);
            }
        });


    }

}
