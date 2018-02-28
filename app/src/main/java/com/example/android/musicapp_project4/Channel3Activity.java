package com.example.android.musicapp_project4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Channel3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        // Create an ArrayList of Songs
        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song(getString(R.string.name1_3), getString(R.string.author1_3)));
        songs.add(new Song(getString(R.string.name2_3), getString(R.string.author2_3)));
        songs.add(new Song(getString(R.string.name3_3), getString(R.string.author3_3)));
        songs.add(new Song(getString(R.string.name4_3), getString(R.string.author4_3)));
        songs.add(new Song(getString(R.string.name5_3), getString(R.string.author5_3)));
        songs.add(new Song(getString(R.string.name6_3), getString(R.string.author6_3)));
        songs.add(new Song(getString(R.string.name7_3), getString(R.string.author7_3)));
        songs.add(new Song(getString(R.string.name8_3), getString(R.string.author8_3)));
        songs.add(new Song(getString(R.string.name9_3), getString(R.string.author9_3)));
        songs.add(new Song(getString(R.string.name10_3), getString(R.string.author10_3)));


        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
        com.example.android.musicapp_project4.SongAdapter adapter = new com.example.android.musicapp_project4.SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}

