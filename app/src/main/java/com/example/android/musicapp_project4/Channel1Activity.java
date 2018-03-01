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

        songs.add(new Song(getString(R.string.name1_1), getString(R.string.author1_1)));
        songs.add(new Song(getString(R.string.name2_1), getString(R.string.author2_1)));
        songs.add(new Song(getString(R.string.name3_1), getString(R.string.author3_1)));
        songs.add(new Song(getString(R.string.name4_1), getString(R.string.author4_1)));
        songs.add(new Song(getString(R.string.name5_1), getString(R.string.author5_1)));
        songs.add(new Song(getString(R.string.name6_1), getString(R.string.author6_1)));
        songs.add(new Song(getString(R.string.name7_1), getString(R.string.author7_1)));
        songs.add(new Song(getString(R.string.name8_1), getString(R.string.author8_1)));
        songs.add(new Song(getString(R.string.name9_1), getString(R.string.author9_1)));
        songs.add(new Song(getString(R.string.name10_1), getString(R.string.author10_1)));


        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // songs_list layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SongAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Song} in the list.
        listView.setAdapter(adapter);
    }
}
