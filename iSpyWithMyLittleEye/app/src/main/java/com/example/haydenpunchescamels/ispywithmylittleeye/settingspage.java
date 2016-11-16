package com.example.haydenpunchescamels.ispywithmylittleeye;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class settingspage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settingspage);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // Enable back navigation

    }
}
