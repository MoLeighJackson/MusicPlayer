package com.example.moleigh.musicplayer;

public class SongDetails {

    private String mNameOfArtist;

    private String mNameOfTrack;

    private int mAudioResourceId;

    public SongDetails(String nameOfArtist, String nameOfTrack, int audioResourceID) {
        mNameOfArtist = nameOfArtist;
        mNameOfTrack = nameOfTrack;
        mAudioResourceId = audioResourceID;
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

    /*
    get audio file for selected track
    */
    public int getmAudioResourceId() {
        return mAudioResourceId;
    }
}

