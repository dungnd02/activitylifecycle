package com.example.activitylife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import static android.content.ContentValues.TAG;

public class ActivityA extends AppCompatActivity {
Button play;
MediaPlayer song;
private static  final String TAG  = "Activity A";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);
        play = findViewById(R.id.btnActivityA);
        Log.e(TAG, "onCreate A()");
        song = MediaPlayer.create(ActivityA.this,R.raw.ex_3);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityA.this,ActivityB.class);
                startActivity(intent);
            }
        });

    }
    protected void onStart(){
        super.onStart();
        song.start();
        Log.e(TAG, "onStart A");

    }
    protected void onResume(){
        super.onResume();
        Log.e(TAG, "onResume A");

    }
    protected void onPause(){
        super.onPause();
        Log.e(TAG, "onPause A");
    }
    protected void onStop(){
        super.onStop();
        song.stop();
        Log.e(TAG, "onStop A");
    }
    protected void onDestroy(){
        super.onDestroy();
        song.release();
        Log.e(TAG, "onDestroy A");
    }

}