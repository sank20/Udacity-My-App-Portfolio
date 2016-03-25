package com.sank.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    //Declare Buttons
    Button spotifyStreamer;
    Button scoresApp;
    Button libraryApp;
    Button buildItBigger;
    Button xyzReader;
    Button capstone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize the buttons
        spotifyStreamer = (Button) findViewById(R.id.button_spotify_streamer);
        scoresApp = (Button) findViewById(R.id.button_scores_app);
        libraryApp = (Button) findViewById(R.id.button_library_app);
        buildItBigger = (Button) findViewById(R.id.button_build_it_bigger);
        xyzReader = (Button) findViewById(R.id.button_xyz_reader);
        capstone = (Button) findViewById(R.id.button_capstone);

        //set OnClickListener for each button
        spotifyStreamer.setOnClickListener(this);
        scoresApp.setOnClickListener(this);
        libraryApp.setOnClickListener(this);
        buildItBigger.setOnClickListener(this);
        xyzReader.setOnClickListener(this);
        capstone.setOnClickListener(this);

    }

    /**
     * Called when a view has been clicked.
     *Will show a toast on each click
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.button_spotify_streamer:
                Toast.makeText(MainActivity.this, "This button will launch " + spotifyStreamer.getText() + " app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_scores_app:
                Toast.makeText(MainActivity.this, "This button will launch " + scoresApp.getText()+ " !", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_library_app:
                Toast.makeText(MainActivity.this, "This button will launch " + libraryApp.getText()+ " !", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_build_it_bigger:
                Toast.makeText(MainActivity.this, "This button will launch " + buildItBigger.getText()+ " app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_xyz_reader:
                Toast.makeText(MainActivity.this, "This button will launch " + xyzReader.getText()+ " app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_capstone:
                Toast.makeText(MainActivity.this, "This button will launch " + capstone.getText()+ "!", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
