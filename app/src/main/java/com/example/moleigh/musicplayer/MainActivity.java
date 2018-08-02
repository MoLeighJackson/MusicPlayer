package com.example.moleigh.musicplayer;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView numbers = (TextView) findViewById(R.id.track_name);

// Set a click listener on the track name view
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the track name View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playSongIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(playSongIntent);
            }
        });

    }

}
