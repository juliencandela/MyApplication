package com.example.myapplication.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marie-helene on 10/02/15.
 */
public class LivreActivity extends Activity {

    List<Livre> maBibliotheque = new ArrayList<Livre>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_layout);
        this.RemplirLaBibliotheque();
        ListView myListView = (ListView) findViewById(R.id.myListView);
        LivreAdapter adapter = new LivreAdapter(this, maBibliotheque);
        myListView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private void RemplirLaBibliotheque() {

        for (int i = 0; i < 200; i++) {

            //maBibliotheque.clear();
            maBibliotheque.add(new Livre("Starcraft 2 : Les diables du ciel",
                    "William-C Dietz"));
            maBibliotheque.add(new Livre("L'art du développement Android",
                    "Mark Murphy"));
            maBibliotheque.add(new Livre("Le seuil des ténèbres", "Karen Chance"));
            maBibliotheque.add(new Livre("Starcraft 2 : Les diables du ciel",
                    "William-C Dietz"));
            maBibliotheque.add(new Livre("L'art du développement Android",
                    "Mark Murphy"));
            maBibliotheque.add(new Livre("Le seuil des ténèbres", "Karen Chance"));
            maBibliotheque.add(new Livre("Starcraft 2 : Les diables du ciel",
                    "William-C Dietz"));
            maBibliotheque.add(new Livre("L'art du développement Android",
                    "Mark Murphy"));
            maBibliotheque.add(new Livre("Le seuil des ténèbres", "Karen Chance"));
        }
    }


}
