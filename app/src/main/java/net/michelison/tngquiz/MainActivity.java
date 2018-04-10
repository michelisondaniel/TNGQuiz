package net.michelison.tngquiz;

// images for this quiz were acquired from giphy.com and images also from the
// website from which I recrafted most of these questions for my own needs
// https://www.thequiz.com/only-a-real-star-trek-fan-can-get-100-on-this-tng-quiz/


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import pl.droidsonroids.gif.GifTextView;


public class MainActivity extends Activity implements View.OnClickListener {

    Button startButton;
    GifTextView spockGifView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spockGifView = (GifTextView) findViewById(R.id.spockGifView);
        startButton = (Button) findViewById(R.id.startButton);
        startButton.setOnClickListener(this);

        spockGifView.setBackgroundResource(R.drawable.dwnspockdog);


        }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(MainActivity.this, QuizActivity.class));


    }


}
