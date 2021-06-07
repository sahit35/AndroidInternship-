package com.example.examplelife;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("APSSDC", "Second activity Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("APSSDC", "Second activity Resumed");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("APSSDC", "Second activity paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("APSSDC", "Second activity stopped");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("APSSDC", "Second activity Restarted");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("APSSDC", "Second activity Destroyed");
    }
}

