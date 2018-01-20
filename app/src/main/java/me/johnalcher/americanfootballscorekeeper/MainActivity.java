package me.johnalcher.americanfootballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

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

        // TODO: Remove these display methods.
        displayHomeScore(21);
        displayAwayScore(12);
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
     * TODO: implement callback functions for button events.
     */
}
