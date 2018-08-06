package com.example.moleigh.musicplayer;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class NowPlayingActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.this_is_a_jazz_space);

        // code for recently played button on now playing screen
        Button playedRecentlyBtn = (Button) findViewById(R.id.recently_played_btn);
        playedRecentlyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent showRecentlyPlayedScreen = new Intent(NowPlayingActivity.this, RecentlyPlayedActivity.class);
                startActivity(showRecentlyPlayedScreen);
            }
        });


        //play and pause button methods
        Button playButton = (Button) findViewById(R.id.play_btn);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v){
                mediaPlayer.start();
            }
        });

        Button pauseButton = (Button) findViewById(R.id.pause_btn);

        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v){
                mediaPlayer.pause();
            }
        });


    }

}



