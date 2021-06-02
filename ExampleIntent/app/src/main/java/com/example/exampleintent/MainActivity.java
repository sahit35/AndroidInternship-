package com.example.exampleintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //declaring the views
    EditText name,number,link;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Initialising the views
        name= findViewById(R.id.name);
        number= findViewById(R.id.number);
        link= findViewById(R.id.link);
    }

    public void next(View view) {
        //working with explicit intent
        String n = name.getText().toString();
        // Intent obj = new Intent (present class, next class)
        // StartActivity(obj)
        Intent i = new Intent(this,SecondActivity.class);
        i.putExtra("key",n);
        startActivity(i);
    }

    public void Dail(View view) {
        //working with implicit
        String n = number.getText().toString();
        // uri - unified resource identifier
        // phone - tel; , web- https:// .
        Uri uri = Uri.parse("tel:"+n);
        Intent i = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(i);
    }
    public void Search(View view) {
        String n = link.getText().toString();
        Uri uri = Uri.parse("https://"+n);
        Intent i = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(i);
    }
}