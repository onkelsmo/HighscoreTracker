package com.onkelsmo.highscoretracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private ArrayAdapter<String> gameSelectorAdapter;
    private Spinner gameSelector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gameSelector = (Spinner)findViewById(R.id.game_selector);
        gameSelectorAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_spinner_item,
                // TODO: 14.02.2016 get games from database
                new String[] {
                        getString(R.string.generic_game),
                        getString(R.string.robinson_crusoe),
                }
        );
        gameSelectorAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gameSelector.setAdapter(gameSelectorAdapter);
    }
}
