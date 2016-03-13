package com.onkelsmo.highscoretracker.gameActivities;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.onkelsmo.highscoretracker.R;

public class GenericGameActivity extends AppCompatActivity implements View.OnClickListener {
    private ListView listView;
    private PlayerListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.generic_game);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle(R.string.generic_game);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        listView = (ListView)findViewById(R.id.player_list_view);
        adapter = new PlayerListAdapter(this, 0);
        listView.setAdapter(adapter);

//        ImageButton addNewInputButton = (ImageButton)findViewById(R.id.add_new_input);
//        addNewInputButton.setOnClickListener(this);
        Button saveButton = (Button)findViewById(R.id.save_button);
        saveButton.setOnClickListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        finish();
        return true;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.add_new_input:

                break;
            case R.id.save_button:
                // TODO: 13.03.2016 save the inputs into DB
                break;
        }
    }

    private class PlayerListAdapter extends ArrayAdapter<View> {
        public PlayerListAdapter(Context context, int resource) {
            super(context, resource);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.players_list, null);
            }

            TextView tvPlayerNumber = (TextView)convertView.findViewById(R.id.player_number_label);
            tvPlayerNumber.setText(Integer.toString(position + 1) + ":");

            Log.d("DEBUG: ", "getView of PlayerListAdapter called!");

            return convertView;
        }


    }
}
