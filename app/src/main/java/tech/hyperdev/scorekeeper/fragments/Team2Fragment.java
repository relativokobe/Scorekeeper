package tech.hyperdev.scorekeeper.fragments;


import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

import tech.hyperdev.scorekeeper.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Team2Fragment extends Fragment {


    ImageButton plus;
    ImageButton minus;
    TextView score;
    int scoreText = 0;
    public Team2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_team2, container, false);

        plus  = (ImageButton) view.findViewById(R.id.btnPlus);
        minus = (ImageButton)view.findViewById(R.id.btnMinus);
        score = (TextView)view.findViewById(R.id.team2Score);
        if(savedInstanceState!=null){
            scoreText = savedInstanceState.getInt("team2score",0);
            score.setText(scoreText+"");
        }
/*
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreText++;
                score.setText(scoreText+"");
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreText--;
                score.setText(scoreText+"");
            }
        });*/



        return view;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("team2score",scoreText);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);


    }
}
