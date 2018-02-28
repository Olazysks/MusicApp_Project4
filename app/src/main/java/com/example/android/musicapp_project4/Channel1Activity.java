package com.example.android.musicapp_project4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Channel1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        // Create an ArrayList of Songs
        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song(getString(R.string.name1_4), getString(R.string.author1_4)));
        songs.add(new Song(getString(R.string.name2_4), getString(R.string.author2_4)));
        songs.add(new Song(getString(R.string.name3_4), getString(R.string.author3_4)));
        songs.add(new Song(getString(R.string.name4_4), getString(R.string.author4_4)));
        songs.add(new Song(getString(R.string.name5_4), getString(R.string.author5_4)));
        songs.add(new Song(getString(R.string.name6_4), getString(R.string.author6_4)));
        songs.add(new Song(getString(R.string.name7_4), getString(R.string.author7_4)));
        songs.add(new Song(getString(R.string.name8_4), getString(R.string.author8_4)));
        songs.add(new Song(getString(R.string.name9_4), getString(R.string.author9_4)));
        songs.add(new Song(getString(R.string.name10_4), getString(R.string.author10_4)));


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

