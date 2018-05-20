package com.example.max.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked(View view){

        int id = view.getId();
        String myId = view.getResources().getResourceEntryName(id);

        int resource = getResources().getIdentifier(myId, "raw", "com.example.max.basicphrases");

        MediaPlayer mPlayer = MediaPlayer.create(this, resource);
        mPlayer.start();

    }
}
