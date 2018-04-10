package net.michelison.tngquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ResultsActivity extends Activity {

    TextView grade, finalScore;
    Button retryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        grade = (TextView) findViewById(R.id.grade);
        finalScore = (TextView) findViewById(R.id.outOf);
        retryButton = (Button) findViewById(R.id.retryButton);

        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("finalScore");

        finalScore.setText("You scored " + score + " out of " + QuizBook.questions.length);

        if (score == 10){
            grade.setText("You're a true fan! Congrats!");
        } else if (score == 9){
            grade.setText("You're a fan, that's for sure.");
        } else if (score == 8){
            grade.setText("You've watched some TNG.");
        } else {
            grade.setText("I wouldn't get into conversations with others about TNG.");
        }


        retryButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(ResultsActivity.this, QuizActivity.class));
                ResultsActivity.this.finish();

            }
        });

    }
}
