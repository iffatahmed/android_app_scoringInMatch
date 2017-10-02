package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int currentScoreTeamA=0;
    int currentScoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void plusOnePointsA(View view) {
        currentScoreTeamA=currentScoreTeamA+1;
        displayForTeamA(currentScoreTeamA);
    }
    public void plusTwoPointsA(View view) {
        currentScoreTeamA=currentScoreTeamA+2;
        displayForTeamA(currentScoreTeamA);
    }
    public void plusThreePointsA(View view) {
        currentScoreTeamA=currentScoreTeamA+3;
        displayForTeamA(currentScoreTeamA);
    }
    public void plusOnePointsB(View view) {
        currentScoreTeamB=currentScoreTeamB+1;
        displayForTeamB(currentScoreTeamB);
    }
    public void plusTwoPointsB(View view) {
        currentScoreTeamB=currentScoreTeamB+2;
        displayForTeamB(currentScoreTeamB);
    }
    public void plusThreePointsB(View view) {
        currentScoreTeamB=currentScoreTeamB+3;
        displayForTeamB(currentScoreTeamB);
    }

    public void resetFunc(View view) {
        currentScoreTeamA=0;
        currentScoreTeamB=0;
        displayForTeamA(currentScoreTeamA);
        displayForTeamB(currentScoreTeamB);
    }
}
