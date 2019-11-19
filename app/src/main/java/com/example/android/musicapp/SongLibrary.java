package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class SongLibrary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_library);

        Button backButton=(Button) findViewById(R.id.back_button);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(SongLibrary.this,MainActivity.class);
                startActivity(i); }
        });

        ArrayList<SongInfo> songs=new ArrayList<SongInfo>();
        songs.add(new SongInfo("Or Nah","Ty $ign ft Weekend, Wiz Khalifa ",R.drawable.song_pic));
        songs.add(new SongInfo("In The End","Linkin Park ",R.drawable.best_of_lp));
        songs.add(new SongInfo("Believer","Imagine Dragon ",R.drawable.rock_play_list));
        songs.add(new SongInfo("In My Feelings","Drake ",R.drawable.drake));
        songs.add(new SongInfo("So High","Wiz Khalifa ",R.drawable.wiz));
        songs.add(new SongInfo("So Far Away","Martin Garrix & David Gauetta ",R.drawable.so_far_away));
        songs.add(new SongInfo("Spotlight","Marsmallow & Lil Peep ",R.drawable.spotlight));
        songs.add(new SongInfo("Entertainer","Zayn Malik ",R.drawable.zayn_entertaine));
        songs.add(new SongInfo("This Is All We Know","Chainsmokers ft. Pheobe Ryan",R.drawable.download));

        CustomAdapter itemsAdapter= new CustomAdapter(this,songs);
        ListView listView = (ListView) findViewById(R.id.list1);
        listView.setAdapter(itemsAdapter);
    }
}
