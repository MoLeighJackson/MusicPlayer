package com.example.moleigh.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecentlyPlayedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recently_played);

        //create an array of songs
        ArrayList<SongDetails> tracks = new ArrayList<SongDetails>();

        tracks.add(new SongDetails("Artist: Midnight North", "Song: This is a Jazz Space"));
        tracks.add(new SongDetails("Artist: Aaron Kenny", "Song: The Black Cat"));
        tracks.add(new SongDetails("Artist: Quincas Moreira", "Song: Canal 3"));

        SongDetailsAdapter adapter = new SongDetailsAdapter(this, tracks);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
