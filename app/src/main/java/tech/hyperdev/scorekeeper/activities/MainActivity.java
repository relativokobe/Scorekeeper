package tech.hyperdev.scorekeeper.activities;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import tech.hyperdev.scorekeeper.R;
import tech.hyperdev.scorekeeper.fragments.Team1Fragment;
import tech.hyperdev.scorekeeper.fragments.Team2Fragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        if(savedInstanceState == null) {

            final FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.team1, new Team1Fragment())
                    .addToBackStack("team1")
                    .commit();

            fragmentManager.beginTransaction()
                    .replace(R.id.team2, new Team2Fragment())
                    .addToBackStack("team2")
                    .commit();

        }

    }
}
