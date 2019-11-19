package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Playlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        Button backButton=(Button) findViewById(R.id.back_button);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Playlist.this,MainActivity.class);
                startActivity(i); }
        });

        ArrayList<SongInfo> songs=new ArrayList<SongInfo>();
        songs.add(new SongInfo("FAVOURAITES","53 Songs,262 minutes",R.drawable.favouraites));
        songs.add(new SongInfo("DRIVING","23 Songs,121 minutes",R.drawable.car_play_list));
        songs.add(new SongInfo("LINKIN PARK HITS","29 Songs,147 minutes",R.drawable.best_of_lp));
        songs.add(new SongInfo("FAVOURAITES","64 Songs,297 minutes",R.drawable.party_play_list));
        songs.add(new SongInfo("BEST OF ROCK/METAL","18 Songs, 91 minutes",R.drawable.rock_play_list));

        CustomAdapter itemsAdapter= new CustomAdapter(this,songs);
        ListView listView = (ListView) findViewById(R.id.list2);
        listView.setAdapter(itemsAdapter);
    }
}
