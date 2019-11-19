package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button libraryButton=(Button) findViewById(R.id.library_button);
        Button playingNowButton=(Button) findViewById(R.id.playingNow_button);
        Button playlistButton=(Button) findViewById(R.id.playlist_button);
        Button paymentButton=(Button) findViewById(R.id.payment_button);

        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, SongLibrary.class);
                startActivity(i);
            }});
        playlistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, Playlist.class);
                startActivity(i);
            }});
        playingNowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(i);
            }});
        paymentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, Payment.class);
                startActivity(i);
            }});
    }
}

