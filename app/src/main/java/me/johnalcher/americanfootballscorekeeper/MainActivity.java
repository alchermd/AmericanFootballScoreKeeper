package me.johnalcher.americanfootballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

/**
 * This activity keeps track of the score for two Football teams.
 */
public class MainActivity extends AppCompatActivity {
    int homeScore = 0;
    int awayScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the score for the HOME team.
     *
     * @param score
     */
    public void displayHomeScore(int score) {
        TextView homeScore = (TextView) findViewById(R.id.home_score);
        homeScore.setText(Integer.toString(score));
    }

    /**
     * Displays the score for the AWAY team.
     *
     * @param score
     */
    public void displayAwayScore(int score) {
        TextView awayScore = (TextView) findViewById(R.id.away_score);
        awayScore.setText(Integer.toString(score));
    }


    /**
     * This method is called when the HOME team scores a touchdown.
     *
     * @param view
     */
    public void homeTouchDown(View view) {
        homeScore += 6;
        displayHomeScore(homeScore);
    }

    /**
     * This method is called when the HOME team scores a field goal.
     *
     * @param view
     */
    public void homeFieldGoal(View view) {
        homeScore += 3;
        displayHomeScore(homeScore);
    }

    /**
     * This method is called when the HOME team scores two points.
     *
     * @param view
     */
    public void homePlusTwo(View view) {
        homeScore += 2;
        displayHomeScore(homeScore);
    }

    /**
     * This method is called when the HOME team scores a point.
     *
     * @param view
     */
    public void homePlusOne(View view) {
        homeScore += 1;
        displayHomeScore(homeScore);
    }

    /**
     * This method is called when the AWAY team scores a touchdown.
     *
     * @param view
     */
    public void awayTouchDown(View view) {
        awayScore += 6;
        displayAwayScore(awayScore);
    }

    /**
     * This method is called when the AWAY team scores a field goal.
     *
     * @param view
     */
    public void awayFieldGoal(View view) {
        awayScore += 3;
        displayAwayScore(awayScore);
    }

    /**
     * This method is called when the AWAY team scores two points.
     *
     * @param view
     */
    public void awayPlusTwo(View view) {
        awayScore += 2;
        displayAwayScore(awayScore);
    }

    /**
     * This method is called when the AWAY team scores a point.
     *
     * @param view
     */
    public void awayPlusOne(View view) {
        awayScore += 1;
        displayAwayScore(awayScore);
    }
}
