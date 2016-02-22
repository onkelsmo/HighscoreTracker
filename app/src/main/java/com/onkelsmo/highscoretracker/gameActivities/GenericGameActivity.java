package com.onkelsmo.highscoretracker.gameActivities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.onkelsmo.highscoretracker.R;

public class GenericGameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.generic_game);
    }
}
