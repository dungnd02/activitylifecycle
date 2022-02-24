package com.example.activitylife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityB extends AppCompatActivity {
    private static final String TAG = "Activity B";
    MediaPlayer songb;
    Button playb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        playb = findViewById(R.id.btnActivityB);
        Log.e(TAG, "onCreate B()");
        songb = MediaPlayer.create(ActivityB.this,R.raw.ex_4);
        playb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityB.this,ActivityA.class);
                startActivity(intent);
            }
        });
    }
    protected void onStart(){
        super.onStart();
        songb.start();
        Log.e(TAG, "onStart B");

    }
    protected void onResume(){
        super.onResume();
        Log.e(TAG, "onResume B");

    }
    protected void onPause(){
        super.onPause();
        Log.e(TAG, "onPause B");
    }
    protected void onStop(){
        super.onStop();
        songb.stop();
        Log.e(TAG, "onStop B");
    }
    protected void onDestroy(){
        super.onDestroy();
        songb.release();
        Log.e(TAG, "onDestroy B");
    }
}