package com.jayhixson.umpbuddy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

        private Button mBallButton;
        private Button mStrikeButton;
        private TextView mBallTextView;
        private TextView mStrikeTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    mBallButton = (Button) findViewById(R.id.ball_button);
    mBallButton.setOnClickListener(new View.OnClickListener(){
        @Override public void onClick(View v) {
            // not yet implemented
            // umpCall.ball();
        }
    });
    mStrikeButton = (Button) findViewById(R.id.strike_button);
    mStrikeButton.setOnClickListener(new View.OnClickListener(){
        @Override public void onClick(View v) {
            // not yet implemented
            // umpCall.strike();
        }
    });
    }



}
