package com.example.moleigh.musicplayer;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


// code for now playing screen

        final TextView playTrack = (TextView) findViewById(R.id.track_name);
        playTrack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playSongIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(playSongIntent);
            }

        });


        TextView playTrack2 = (TextView) findViewById(R.id.track_name2);
        playTrack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playSongIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(playSongIntent);
            }
        });

        TextView playTrack3 = (TextView) findViewById(R.id.track_name3);
        playTrack3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playSongIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(playSongIntent);
            }
        });


        // code for recently played screen
        TextView playedRecently = (TextView) findViewById(R.id.recently_played);
        playedRecently.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent showRecentlyPlayedScreen = new Intent(MainActivity.this, RecentlyPlayedActivity.class);
                startActivity(showRecentlyPlayedScreen);
            }
        });


    }

}
