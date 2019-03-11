package com.gzeinnumer.playsound;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void play(View view) {
        MediaPlayer soundSukses = MediaPlayer.create(this, R.raw.definite);
        MediaPlayer soundGagal = MediaPlayer.create(this, R.raw.system_fault);

        soundSukses.start();
        soundGagal.start();
    }
}
