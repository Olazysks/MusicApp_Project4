package com.example.android.musicapp_project4;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.android.musicapp_project4.R;
import com.example.android.musicapp_project4.Song;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param songs   A List of Song objects to display in a list
     */
    public SongAdapter(Activity context, ArrayList<Song> songs) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.

        // We can pass 0 as a resource id because we are inflating the layout ourselves in the getView method.
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID name_text_view
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        // Get the name from the current Song object and
        // set this text on the name TextView
        nameTextView.setText(currentSong.getName());

        // Find the TextView in the list_item.xml layout with the ID author_text_view
        TextView authorTextView = (TextView) listItemView.findViewById(R.id.author_text_view);
        // Get the author from the current Song object and
        // set this text on the author TextView
        authorTextView.setText(currentSong.getAuthor());

        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
