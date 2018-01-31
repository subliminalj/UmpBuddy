package com.jayhixson.umpbuddy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

        private Button mBallButton;
        private Button mStrikeButton;
        //private TextView mBallTextView;
        //private TextView mStrikeTextView;
        private UmpCall mUmpCalls = new UmpCall(0,0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        updateDisplay();

    mBallButton = (Button) findViewById(R.id.ball_button);
    mBallButton.setOnClickListener(new View.OnClickListener(){
        @Override public void onClick(View v) {
             mUmpCalls.ball();
             updateDisplay();
            if (mUmpCalls.getBallCount()==0){
                Toast.makeText(getApplicationContext(),R.string.walk_toast,Toast.LENGTH_SHORT).show();
            }

        }
    });
    mStrikeButton = (Button) findViewById(R.id.strike_button);
    mStrikeButton.setOnClickListener(new View.OnClickListener(){
        @Override public void onClick(View v) {
             mUmpCalls.strike();
             updateDisplay();
            if (mUmpCalls.getStrikeCount()==0){
                Toast.makeText(getApplicationContext(),R.string.out_toast,Toast.LENGTH_SHORT).show();
            }
        }
    });
    }

    private void updateDisplay() {
        TextView mBallTextView = (TextView)findViewById(R.id.ballTextView);
        mBallTextView.setText(Integer.toString(mUmpCalls.getBallCount()));

        TextView mStrikeTextView = (TextView)findViewById(R.id.strikeTextView);
        mStrikeTextView.setText(Integer.toString(mUmpCalls.getStrikeCount()));
    }

}
