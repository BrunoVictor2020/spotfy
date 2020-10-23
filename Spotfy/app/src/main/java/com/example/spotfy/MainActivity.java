package com.example.spotfy;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.mine);
    }
    public void tocar(View view){
        i++;
        if(i%2==0){
            mediaPlayer.pause();
        }
        else{
            mediaPlayer.start();
        }
    }
}
