package tech.hyperdev.scorekeeper.activities;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

import tech.hyperdev.scorekeeper.R;
import tech.hyperdev.scorekeeper.Utils;
import tech.hyperdev.scorekeeper.fragments.Team1Fragment;
import tech.hyperdev.scorekeeper.fragments.Team2Fragment;

public class MainActivity extends AppCompatActivity {
   // private boolean isChecked = false;
    ToggleButton toggleButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Utils.onActivityCreateSetTheme(this);

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);

        toggleButton = (ToggleButton)menu.findItem(R.id.toggle).getActionView().findViewById(R.id.switch_show_protectedKobe);

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, "Go to night", Toast.LENGTH_SHORT).show();
                    toggleButton.setBackgroundColor(Color.BLACK);
                    toggleButton.setTextColor(Color.WHITE);
                    Utils.changeToTheme(MainActivity.this,false);
                } else {
                    Toast.makeText(MainActivity.this, "Go to day", Toast.LENGTH_SHORT).show();
                    toggleButton.setBackgroundColor(Color.WHITE);
                    toggleButton.setTextColor(Color.BLACK);
                    Utils.changeToTheme(MainActivity.this,true);

                }
            }
        });


            return true;
    }

   /* @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.toggle){
            toggleButton = (ToggleButton)item.getActionView().findViewById(R.id.switch_show_protectedKobe);

            toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(isChecked){
                        Log.e("kobe","PIste  "+isChecked);
                        Toast.makeText(MainActivity.this, "Go to night", Toast.LENGTH_SHORT).show();
                        MainActivity.this.setTheme(R.style.AppTheme_KobeTheme);
                        Toast.makeText(MainActivity.this, "After Go to night piseng yawa", Toast.LENGTH_SHORT).show();

                    }
                    else
                        Toast.makeText(MainActivity.this, "Go to day", Toast.LENGTH_SHORT).show();
                         MainActivity.this.setTheme(R.style.AppTheme);
                }
            });
        }

         *//*    toggleButton = (ToggleButton)item
                .findItem(R.id.toggle).getActionView()
                .findViewById(R.id.switch_show_protectedKobe);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(MainActivity.this, "GO TO NIGHT", Toast.LENGTH_SHORT).show();
                }
                else Toast.makeText(MainActivity.this, "GO TO DAY", Toast.LENGTH_SHORT).show();
            }
        });*//*

        return super.onOptionsItemSelected(item);
    }

*/

}
