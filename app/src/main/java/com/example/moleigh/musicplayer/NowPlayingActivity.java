package com.example.moleigh.musicplayer;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class NowPlayingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        // code for recently played button on now playing screen
        Button playedRecentlyBtn = (Button) findViewById(R.id.recently_played_btn);
        playedRecentlyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent showRecentlyPlayedScreen = new Intent(NowPlayingActivity.this, RecentlyPlayedActivity.class);
                startActivity(showRecentlyPlayedScreen);
            }
        });

        Button playButton = (Button) findViewById(R.id.play_btn);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v){
                Toast.makeText(NowPlayingActivity.this, "Play", Toast.LENGTH_LONG).show();
            }
        });


    }

}



