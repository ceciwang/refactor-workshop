package com.thoughtworks;

public class CapitalCalculator {
    private static final double ADJ_FACTOR = 0.1;
    private double capital;
    private double income;
    private double intRate;
    private double duration;

    public CapitalCalculator(double capital, double income, double intRate, double duration) {
        this.capital = capital;
        this.income = income;
        this.intRate = intRate;
        this.duration = duration;
    }

    public double getAdjustedCapital(){
        if (capital <= 0.0) {
            return 0.0;
        }
        if (intRate <= 0.0 || duration <= 0.0) {
            return 0.0;
        }
        return (income / duration) * ADJ_FACTOR;
    }
}
