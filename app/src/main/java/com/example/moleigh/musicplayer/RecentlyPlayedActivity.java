package com.example.moleigh.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class RecentlyPlayedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recently_played);

        //create an array of songs
        ArrayList<String> tracks = new ArrayList<String>();
        tracks.add("This is a Jazz Space by Midnight North");
        tracks.add("The Black Cat by Aaron Kenny");
        tracks.add("Canal 3 by Quincas Moreira");

        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        for (int index = 0; index < tracks.size(); index++) {

            TextView trackView = new TextView(this);
            trackView.setText(tracks.get(index));
            rootView.addView(trackView);
        }
    }
}
