package com.example.darnell.deliverjoke;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DeliverJoke extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deliver_joke);
        String myJoke;

        Intent myIntent = getIntent();
        myJoke = myIntent.getStringExtra(Intent.EXTRA_TEXT);



        TextView jokeText = (TextView) findViewById(R.id.joke_textview);

        jokeText.setText(myJoke);
    }
}
