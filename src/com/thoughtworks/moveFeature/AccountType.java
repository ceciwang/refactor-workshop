package com.thoughtworks.moveFeature;

public class AccountType {
    private double interestRate = 0;

    public double getInterestRate() {
        return interestRate;
    }

    public boolean isPremium() {
        return true;
    }

    public double overDraftCharge(int daysOverdrawn) {
        if (isPremium()) {
            double result = 10;
            if (daysOverdrawn > 7) {
                result += (daysOverdrawn - 7) * 0.85;
            }
            return result;
        } else {
            return daysOverdrawn * 1.75;
        }
    }
}
