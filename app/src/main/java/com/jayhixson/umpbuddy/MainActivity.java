package com.jayhixson.umpbuddy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

        private Button mBallButton;
        private Button mStrikeButton;
        private UmpCall mUmpCalls = new UmpCall(0,0);
        private static final String TAG = "UmpBuddy";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       Log.d(TAG,"onCreate(Bundle) called");
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

    @Override
    public void onStart(){
        super.onStart();
        Log.d(TAG,"onStart() called");
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.d(TAG,"onSResume() called");
    }
    @Override
    public void onPause(){
        super.onPause();
        Log.d(TAG,"onPause() called");
    }
    @Override
    public void onStop(){
        super.onStop();
        Log.d(TAG,"onStop() called");
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(TAG,"onDestroy() called");
    }
    private void updateDisplay() {
        TextView mBallTextView = (TextView)findViewById(R.id.ballTextView);
        mBallTextView.setText(Integer.toString(mUmpCalls.getBallCount()));

        TextView mStrikeTextView = (TextView)findViewById(R.id.strikeTextView);
        mStrikeTextView.setText(Integer.toString(mUmpCalls.getStrikeCount()));

        TextView mOutTextView = (TextView)findViewById(R.id.outTextView);
        mOutTextView.setText(Integer.toString(mUmpCalls.getOutCount()));

        TextView mInningTextView = (TextView)findViewById(R.id.inningTextView);
        mInningTextView.setText(Integer.toString(mUmpCalls.getInningCount()));
    }

}
