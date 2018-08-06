package com.example.moleigh.musicplayer;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class RecentlyPlayedActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

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

        //onclick listener for audio file
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
          @Override
          public void onItemClick(AdapterView<?> parent, View view, int position, long id){
              mMediaPlayer = MediaPlayer.create(RecentlyPlayedActivity.this, R.raw.this_is_a_jazz_space);
              mMediaPlayer.start();
          }
        });


    }


}
