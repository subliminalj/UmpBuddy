package com.jayhixson.umpbuddy;

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
}
