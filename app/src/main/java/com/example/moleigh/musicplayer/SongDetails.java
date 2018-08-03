package com.example.moleigh.musicplayer;

public class SongDetails {

    private String mNameOfArtist;

    private String mNameOfTrack;

    public SongDetails(String nameOfArtist, String nameOfTrack) {
        mNameOfArtist = nameOfArtist;
        mNameOfTrack = nameOfTrack;
    }

    /*
    get name of artist
     */
    public String getmNameOfArtist() {
        return mNameOfArtist;
    }

    /*
    get name of track
     */
    public String getmNameOfTrack() {
        return mNameOfTrack;
    }
}
