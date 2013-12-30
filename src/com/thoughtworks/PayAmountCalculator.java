package com.thoughtworks;

public class PayAmountCalculator {
    private boolean isDead;
    private boolean isSeparated;
    private boolean isRetired;

    public PayAmountCalculator(boolean dead, boolean separated, boolean retired) {
        isDead = dead;
        isSeparated = separated;
        isRetired = retired;
    }

    int amount() {
        if (isDead) return deadAmount();
        if (isSeparated) return separatedAmount();
        if (isRetired) return retiredAmount();
        return normalPayAmount();
    }


    private int normalPayAmount() {
        //some other code
        return 200;
    }

    private int retiredAmount() {
        //some other code
        return 100;
    }

    private int separatedAmount() {
        //some other code
        return 300;
    }

    private int deadAmount() {
        //some other code
        return 400;
    }
}
