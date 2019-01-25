package com.msl.borrowStrategy;

public abstract class BorrowStrategy {
    private String strategyName;
    private int maxNumber;
    private int maxPeriod;

    public BorrowStrategy(String name, int maxNumber, int maxPeriod){
        this.strategyName = name;
        this.maxNumber = maxNumber;
        this.maxPeriod = maxPeriod;
    }

    public String getStrategyName() {
        return strategyName;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public int getMaxPeriod() {
        return maxPeriod;
    }
}
