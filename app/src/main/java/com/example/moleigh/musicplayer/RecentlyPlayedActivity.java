package com.example.moleigh.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RecentlyPlayedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recently_played);

        //create an array of songs
        String[] tracks = new String[3];
        tracks[0] = "This is a Jazz Space by Midnight North";
        tracks[1] = "The Black Cat by Aaron Kenny";
        tracks[2] = "Canal 3 by Quincas Moreira";

    }
}
