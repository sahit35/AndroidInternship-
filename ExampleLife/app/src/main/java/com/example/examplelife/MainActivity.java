package com.example.examplelife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("APSSDC","First activity Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("APSSDC","First activity Resumed");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("APSSDC","First activity paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("APSSDC","First activity Stopped");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("APSSDC","First activity restarted");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("APSSDC","First activity destroyed");
    }

    public void next(View view) {
        startActivity(new Intent(this,SecondActivity.class));
    }
}