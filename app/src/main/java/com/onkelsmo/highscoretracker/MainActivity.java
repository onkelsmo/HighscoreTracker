package com.onkelsmo.highscoretracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.onkelsmo.highscoretracker.gameActivities.GenericGameActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Spinner gameSelector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gameSelector = (Spinner)findViewById(R.id.game_selector);
        ArrayAdapter<String> gameSelectorAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_spinner_item,
                // TODO: 14.02.2016 get games from database?
                new String[]{
                        getString(R.string.generic_game),
                        getString(R.string.robinson_crusoe),
                }
        );
        gameSelectorAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gameSelector.setAdapter(gameSelectorAdapter);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.new_score_button) {
            int selectedGame = gameSelector.getSelectedItemPosition();
            // TODO: 22.02.2016 the new activity has to be specific by the chosen game... how do we solve this?
            if (selectedGame == R.string.generic_game) {
                Intent intent = new Intent(this, GenericGameActivity.class);
            }



        }
    }
}
