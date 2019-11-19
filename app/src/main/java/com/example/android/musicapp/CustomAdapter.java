package com.example.android.musicapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<SongInfo> {

    public CustomAdapter(Activity context, ArrayList<SongInfo> songDetails) {
        super(context, 0, songDetails);}

    @NonNull
    @Override
    //getview overiding
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_view, parent, false);
        }
        SongInfo currentSong=getItem(position);

        TextView mainTextD= (TextView) listItemView.findViewById(R.id.main_text);
        mainTextD.setText(currentSong.getMainText());

        TextView secondaryTextD= (TextView) listItemView.findViewById(R.id.secondary_text);
        secondaryTextD.setText(currentSong.getSecondaryText());

        ImageView songImage= (ImageView) listItemView.findViewById(R.id.displayImage);
        songImage.setImageResource(currentSong.getImageId());

        return listItemView;
    }
}
