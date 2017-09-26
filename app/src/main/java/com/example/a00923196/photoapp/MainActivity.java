package com.example.a00923196.photoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void filter(View view) {
        Intent i = new Intent(this, FilterActivity.class);
        startActivity(i);
    }

    public void photo(View view) {
        Intent i = new Intent(this, PhotoActivity.class);
        startActivity(i);
    }
}
