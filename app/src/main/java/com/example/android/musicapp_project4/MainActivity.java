package com.example.android.musicapp_project4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows channel 1
        TextView channel1 = (TextView) findViewById(R.id.channel_1);

        // Set a click listener on that View
        channel1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent channel1Intent = new Intent(MainActivity.this, Channel1Activity.class);
                startActivity(channel1Intent);
            }
        });

        // Find the View that shows channel 2
        TextView channel2 = (TextView) findViewById(R.id.channel_2);

        // Set a click listener on that View
        channel2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent channel2Intent = new Intent(MainActivity.this, Channel2Activity.class);
                startActivity(channel2Intent);
            }
        });

        // Find the View that shows channel 3
        TextView channel3 = (TextView) findViewById(R.id.channel_3);

        // Set a click listener on that View
        channel3.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent channel3Intent = new Intent(MainActivity.this, Channel3Activity.class);
                startActivity(channel3Intent);
            }
        });

        // Find the View that shows channel 4
        TextView channel4 = (TextView) findViewById(R.id.channel_4);

        // Set a click listener on that View
        channel4.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent channel4Intent = new Intent(MainActivity.this, Channel4Activity.class);
                startActivity(channel4Intent);
            }
        });
    }
}
