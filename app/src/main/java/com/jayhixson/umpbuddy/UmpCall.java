package com.jayhixson.umpbuddy;

import android.widget.Toast;

import static com.jayhixson.umpbuddy.R.layout.activity_main;

/**
 * Created by jayhixson on 1/30/18.
 */

public class UmpCall {
    private int mBallCount;
    private int mStrikeCount;
    public UmpCall(int ballCount, int strikeCount){
        mBallCount = ballCount;
        mStrikeCount = strikeCount;
    }

    public void setBallCount(int ballCount) {
        mBallCount = ballCount;
    }

    public void setStrikeCount(int strikeCount) {
        mStrikeCount = strikeCount;
    }

    public int getBallCount() {
        return mBallCount;
    }

    public int getStrikeCount() {
        return mStrikeCount;
    }

    public void strike(){
        mStrikeCount++;
        if (mStrikeCount>3){
            mStrikeCount =0;
            mBallCount = 0;
        }
    }
    public void ball(){
        mBallCount++;
        if (mBallCount>4){
            mStrikeCount = 0;
            mBallCount = 0;
        }
    }

}
