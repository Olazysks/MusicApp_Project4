package com.example.android.musicapp_project4;

/**
 * {@Link Song} represents a single song.
 * It contains name of the song and song's author.
 */
public class Song {

    /**
     * Name of the song
     */
    private String mName;

    /**
     * Song author
     */
    private String mAuthor;

    /**
     * Create a new Song object
     */
    public Song(String name, String author) {
        mName = name;
        mAuthor = author;
    }

    /**
     * Get the song name.
     */
    public String getName() {
        return mName;
    }

    /**
     * Get the song author.
     */
    public String getAuthor() {
        return mAuthor;
    }
}
