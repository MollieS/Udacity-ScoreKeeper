package com.mollie.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final int POINT = 15;
    private static final int INITIAL_SCORE = 0;
    private static final int GAME = 1;
    private static final int SET = 1;

    private int playerOnePoints = INITIAL_SCORE;
    private int playerOneGames = INITIAL_SCORE;
    private int playerOneSets = INITIAL_SCORE;

    private int playerTwoPoints = INITIAL_SCORE;
    private int playerTwoGames = INITIAL_SCORE;
    private int playerTwoSets = INITIAL_SCORE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayPlayerOneScore();
        displayPlayerTwoScore();
    }

    public void addPointForPlayerOne(View view) {
        playerOnePoints += POINT;
        displayPlayerOneScore();
    }

    public void addGameForPlayerOne(View view) {
        playerOneGames += GAME;
        displayPlayerOneScore();
    }

    public void addSetForPlayerOne(View view) {
        playerOneSets += SET;
        displayPlayerOneScore();
    }

    public void addPointForPlayerTwo(View view) {
        playerTwoPoints += POINT;
        displayPlayerTwoScore();
    }

    public void addGameForPlayerTwo(View view) {
        playerTwoGames += GAME;
        displayPlayerTwoScore();
    }

    public void addSetForPlayerTwo(View view) {
        playerTwoSets += SET;
        displayPlayerTwoScore();
    }

    public void resetScores(View view) {
        resetScoresForPlayerOne();
        resetScoresForPlayerTwo();
        displayPlayerOneScore();
        displayPlayerTwoScore();
    }

    private void resetScoresForPlayerOne() {
        playerOnePoints = INITIAL_SCORE;
        playerOneGames = INITIAL_SCORE;
        playerOneSets = INITIAL_SCORE;
    }

    private void resetScoresForPlayerTwo() {
        playerTwoPoints = INITIAL_SCORE;
        playerTwoGames = INITIAL_SCORE;
        playerTwoSets = INITIAL_SCORE;
    }

    private void displayPlayerTwoScore() {
        TextView pointsView = (TextView) findViewById(R.id.player_two_points);
        TextView gamesView = (TextView) findViewById(R.id.player_two_games);
        TextView setsView = (TextView) findViewById(R.id.player_two_sets);
        pointsView.setText(String.valueOf(playerTwoPoints));
        gamesView.setText(String.valueOf(playerTwoGames));
        setsView.setText(String.valueOf(playerTwoSets));
    }

    private void displayPlayerOneScore() {
        TextView pointsView = (TextView) findViewById(R.id.player_one_points);
        TextView gamesView = (TextView) findViewById(R.id.player_one_games);
        TextView setsView = (TextView) findViewById(R.id.player_one_sets);
        pointsView.setText(String.valueOf(playerOnePoints));
        gamesView.setText(String.valueOf(playerOneGames));
        setsView.setText(String.valueOf(playerOneSets));
    }
}
