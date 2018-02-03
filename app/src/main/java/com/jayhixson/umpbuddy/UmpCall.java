package com.jayhixson.umpbuddy;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Toast;

import static com.jayhixson.umpbuddy.R.layout.activity_main;

/**
 * Created by jayhixson on 1/30/18.
 */

public class UmpCall {
    private int mBallCount;
    private int mStrikeCount;
    private int mOutCount;
    private int mInning;

    public UmpCall(int ballCount, int strikeCount){
        mBallCount = ballCount;
        mStrikeCount = strikeCount;
        mInning = 1;
    }

    public void setBallCount(int ballCount) {
        mBallCount = ballCount;
    }

    public void setStrikeCount(int strikeCount) {
        mStrikeCount = strikeCount;
    }

    public void setOutCount(int outCount) {mOutCount = outCount; }

    public void setInning(int inning) { mInning = inning; }

    public int getBallCount() {
        return mBallCount;
    }

    public int getStrikeCount() { return mStrikeCount; }

    public int getOutCount() { return mOutCount; }

    public int getInningCount() { return mInning; }

    public void strike(){
        mStrikeCount++;
        if (mStrikeCount>2){
            mStrikeCount =0;
            mBallCount = 0;
            out();
        }
    }
    public void ball(){
        mBallCount++;
        if (mBallCount>4){
            mStrikeCount = 0;
            mBallCount = 0;
        }
    }
    public void out(){
        mOutCount++;
        if ((mOutCount%6)==0){
            newInning();
        }
    }

    public void newInning(){
        mInning++;
        //neverending innings!
    }
}
