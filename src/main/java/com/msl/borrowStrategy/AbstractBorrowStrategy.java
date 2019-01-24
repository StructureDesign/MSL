package com.msl.borrowStrategy;

public abstract class AbstractBorrowStrategy {
    private int maxNumber;
    private int maxPeriod;

    public int getMaxNumber() {
        return maxNumber;
    }

    public int getMaxPeriod() {
        return maxPeriod;
    }
}
