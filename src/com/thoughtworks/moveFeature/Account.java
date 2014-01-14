package com.thoughtworks.moveFeature;

class Account {
    private AccountType type;
    private int daysOverdrawn = 0;
    private double interestRate = 0;

    private double overDraftCharge() {
        if (type.isPremium()) {
            double result = 10;
            if (daysOverdrawn > 7) {
                result += (daysOverdrawn - 7) * 0.85;
            }
            return result;
        } else
            return daysOverdrawn * 1.75;

    }

    public double bankCharge() {
        double result = 4.5;
        if (daysOverdrawn > 0) {
            result += overDraftCharge();
        }
        return result;
    }

    
    double interestForAmount(double amount, int days) {
        return getInterestRate() * amount * days / 365;
    }

    void setType(AccountType type) {
        this.type = type;
    }

    void setDaysOverdrawn(int daysOverdrawn) {
        this.daysOverdrawn = daysOverdrawn;
    }

    public double getInterestRate(){
        return interestRate;
    }

}
