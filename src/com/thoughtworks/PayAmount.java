package com.thoughtworks;

public class PayAmount {
    private boolean isDead;
    private boolean isSeparated;
    private boolean isRetired;

    double getPayAmount(){
        double result;
        if(isDead) result = deadAmount();
        else {
            if(isSeparated) result = separatedAmount();
            else {
                if(isRetired) result = retiredAmount();
                else result = normalPayAmount();
            }
        }
        return result;
    }


    private double normalPayAmount() {
        return 0;
    }

    private double retiredAmount() {
        return 0;
    }

    private double separatedAmount() {
        return 0;
    }

    private double deadAmount() {
        return 0;
    }
}
