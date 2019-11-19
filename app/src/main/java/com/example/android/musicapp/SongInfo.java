package com.example.android.musicapp;

public class SongInfo {
    private String mainText;
    private String secondaryText;
    private int imageId;

    public SongInfo(String text1, String text2,int id){
        mainText=text1;
        secondaryText=text2;
        imageId=id;}
    public String getMainText(){return mainText;}
    public int getImageId(){return imageId;}
    public String getSecondaryText(){return secondaryText;}
}
