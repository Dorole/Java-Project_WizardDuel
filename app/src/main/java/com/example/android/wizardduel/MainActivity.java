package com.example.android.wizardduel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int RavenScore = 0;
    int GryffScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays score for Ravenclaw
     *
     * @param score is points and it updates when spell buttons are clicked
     */
    public void displayForRavenclaw(int score) {
        TextView scoreView = findViewById(R.id.RavenCounter);
        scoreView.setText(String.valueOf(score));

        if (RavenScore >= 50 && GryffScore < 50) {
            //Show "Ravenclaw won!" message as a toast
            Toast.makeText(this, "Ravenclaw won!", Toast.LENGTH_LONG).show();
            return;
        }

        if (GryffScore >= 50 && RavenScore < 50) {
            //Show "Gryffindor won!" message as a toast
            Toast.makeText(this, "Gryffindor won!", Toast.LENGTH_LONG).show();
            return;
        }
    }

    //When Stupefy button is clicked, 4 points are added to Ravenclaw
    public void score_4_R(View view) {
        if (RavenScore >= 50 || GryffScore >= 50) {
            return;
        }

        RavenScore += 4;
        displayForRavenclaw(RavenScore);
    }

    //When Expulso button is clicked, 3 points are added to Ravenclaw
    public void score_3_R(View view) {
        if (RavenScore >= 50 || GryffScore >= 50) {
            return;
        }

        RavenScore += 3;
        displayForRavenclaw(RavenScore);
    }

    //When Levicorpus button is clicked, 2 points are added to Ravenclaw
    public void score_2_R(View view) {
        if (RavenScore >= 50 || GryffScore >= 50) {
            return;
        }

        RavenScore += 2;
        displayForRavenclaw(RavenScore);
    }

    //When Expelliarmus button is clicked, 1 point is added to Ravenclaw
    public void score_1_R(View view) {
        if (RavenScore >= 50 || GryffScore >= 50) {
            return;
        }

        RavenScore += 1;
        displayForRavenclaw(RavenScore);

    }

    /**
     * Displays score for Gryffindor.
     *
     * @param score is points and it updates when spell buttons are clicked
     */
    public void displayForGryffindor(int score) {
        TextView scoreView = findViewById(R.id.GryffCounter);
        scoreView.setText(String.valueOf(score));
    }

    //When Stupefy button is clicked, 4 points are added to Gryffindor
    public void score_4_G(View view) {
        if (RavenScore >= 50 || GryffScore >= 50) {
            return;
        }

        GryffScore += 4;
        displayForGryffindor(GryffScore);
    }

    //When Expulso button is clicked, 3 points are added to Gryffindor
    public void score_3_G(View view) {
        if (RavenScore >= 50 || GryffScore >= 50) {
            return;
        }

        GryffScore += 3;
        displayForGryffindor(GryffScore);
    }

    //When Levicorpus button is clicked, 2 points are added to Gryffindor
    public void score_2_G(View view) {
        if (RavenScore >= 50 || GryffScore >= 50) {
            return;
        }

        GryffScore += 2;
        displayForGryffindor(GryffScore);
    }

    //When Expelliarmus button is clicked, 1 point is added to Gryffindor
    public void score_1_G(View view) {
        if (RavenScore >= 50 || GryffScore >= 50) {
            return;
        }

        GryffScore += 1;
        displayForGryffindor(GryffScore);
    }

    public void resetScore(View view) {
        RavenScore = 0;
        GryffScore = 0;
        displayForRavenclaw(RavenScore);
        displayForGryffindor(GryffScore);
    }
}
