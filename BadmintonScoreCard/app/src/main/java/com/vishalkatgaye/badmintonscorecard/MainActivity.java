package com.vishalkatgaye.badmintonscorecard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    final String RESULT_WIN = "Win";
    final String RESULT_LOSS = "Loss";
    int playerAPointer = 0;
    int playerBPointer = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the point scored by Player A
     */
    public void displayScoreA(int point) {
        TextView pointView = (TextView) findViewById(R.id.scoreCountA);
        pointView.setText(String.valueOf(point));
    }

    /**
     * Displays the point scored by Player B
     */
    public void displayScoreB(int point) {
        TextView pointView = (TextView) findViewById(R.id.scoreCountB);
        pointView.setText(String.valueOf(point));
    }

    /**
     * Displays result of Player A
     */
    public void displayResultA(String result) {
        TextView resultView = (TextView) findViewById(R.id.resultCountA);
        resultView.setText(String.valueOf(result));
    }

    /**
     * Displays result of Player B
     */
    public void displayResultB(String result) {
        TextView resultView = (TextView) findViewById(R.id.resultCountB);
        resultView.setText(String.valueOf(result));
    }

    /**
     * Gives +1 point to Player A
     */
    public void setPlayerAPointer(View view) {
        playerAPointer = playerAPointer + 1;
        if (playerAPointer < 31 && playerBPointer < 31) {
            displayScoreA(playerAPointer);
        }
        if (playerAPointer == 11 && playerBPointer < 10) {
            displayResultA(RESULT_WIN);
            displayResultB(RESULT_LOSS);
            playerAPointer = 0;
            playerBPointer = 0;
        } else if (playerBPointer == 11 && playerAPointer < 10) {
            displayResultB(RESULT_WIN);
            displayResultA(RESULT_LOSS);
            playerAPointer = 0;
            playerBPointer = 0;
        }
        if (playerAPointer > 11 && playerBPointer < (playerAPointer - 1)) {
            int diff = playerAPointer - playerBPointer;
            if (diff > 1) {
                displayResultA(RESULT_WIN);
                displayResultB(RESULT_LOSS);
                playerAPointer = 0;
                playerBPointer = 0;
            }
            if (playerAPointer == 30 && playerBPointer == (playerAPointer - 1)) {
                displayResultA(RESULT_WIN);
                displayResultB(RESULT_LOSS);
                playerAPointer = 0;
                playerBPointer = 0;
            }
        }
    }

    /**
     * Gives +1 point to Player B
     */
    public void setPlayerBPointer(View view) {
        playerBPointer = playerBPointer + 1;
        if (playerBPointer < 31 && playerAPointer < 31) {
            displayScoreB(playerBPointer);
        }
        if (playerBPointer >= 11 && playerAPointer < 10) {
            displayResultA(RESULT_LOSS);
            displayResultB(RESULT_WIN);
            playerAPointer = 0;
            playerBPointer = 0;
        }
        if (playerAPointer >= 11 && playerBPointer < 10) {
            displayResultB(RESULT_LOSS);
            displayResultA(RESULT_WIN);
            playerAPointer = 0;
            playerBPointer = 0;
        }
        if (playerBPointer > 11 && playerAPointer < (playerBPointer - 1)) {
            int diff = playerBPointer - playerAPointer;
            if (diff > 1) {
                displayResultA(RESULT_LOSS);
                displayResultB(RESULT_WIN);
                playerAPointer = 0;
                playerBPointer = 0;
            }
            if (playerBPointer == 30 & playerAPointer == (playerBPointer - 1)) {
                displayResultA(RESULT_LOSS);
                displayResultB(RESULT_WIN);
                playerAPointer = 0;
                playerBPointer = 0;
            }
        }
    }

    /**
     * Away point by Player A to Player B
     */
    public void awayScoreA(View view) {
        playerBPointer = playerBPointer + 1;
        if (playerBPointer < 31 && playerAPointer < 31) {
            displayScoreB(playerBPointer);
        }
        if (playerBPointer >= 11 && playerAPointer < 10) {
            displayResultA(RESULT_LOSS);
            displayResultB(RESULT_WIN);
            playerAPointer = 0;
            playerBPointer = 0;
        }
        if (playerAPointer >= 11 && playerBPointer < 10) {
            displayResultB(RESULT_LOSS);
            displayResultA(RESULT_WIN);
            playerAPointer = 0;
            playerBPointer = 0;
        }
        if (playerBPointer > 11 && playerAPointer < (playerBPointer - 1)) {
            int diff = playerBPointer - playerAPointer;
            if (diff > 1) {
                displayResultA(RESULT_LOSS);
                displayResultB(RESULT_WIN);
                playerAPointer = 0;
                playerBPointer = 0;
            }
            if (playerBPointer == 30 & playerAPointer == (playerBPointer - 1)) {
                displayResultA(RESULT_LOSS);
                displayResultB(RESULT_WIN);
                playerAPointer = 0;
                playerBPointer = 0;
            }
        }
    }

    /**
     * Away point by Player B to Player A
     */
    public void awayScoreB(View view) {
        playerAPointer = playerAPointer + 1;
        if (playerAPointer < 31 && playerBPointer < 31) {
            displayScoreA(playerAPointer);
        }
        if (playerAPointer == 11 && playerBPointer < 10) {
            displayResultA(RESULT_WIN);
            displayResultB(RESULT_LOSS);
            playerAPointer = 0;
            playerBPointer = 0;
        } else if (playerBPointer == 11 && playerAPointer < 10) {
            displayResultB(RESULT_WIN);
            displayResultA(RESULT_LOSS);
            playerAPointer = 0;
            playerBPointer = 0;
        }
        if (playerAPointer > 11 && playerBPointer < (playerAPointer - 1)) {
            int diff = playerAPointer - playerBPointer;
            if (diff > 1) {
                displayResultA(RESULT_WIN);
                displayResultB(RESULT_LOSS);
                playerAPointer = 0;
                playerBPointer = 0;
            }
            if (playerAPointer == 30 && playerBPointer == (playerAPointer - 1)) {
                displayResultA(RESULT_WIN);
                displayResultB(RESULT_LOSS);
                playerAPointer = 0;
                playerBPointer = 0;
            }
        }
    }

    /**
     * Resets the score card.
     */
    public void reset(View view) {
        playerAPointer = 0;
        playerBPointer = 0;

        displayScoreA(playerAPointer);
        displayScoreB(playerBPointer);

        displayResultA("-");
        displayResultB("-");
    }
}