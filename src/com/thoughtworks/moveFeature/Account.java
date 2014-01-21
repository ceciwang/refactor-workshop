package com.thoughtworks.moveFeature;

class Account {
    private AccountType type;
    public int daysOverdrawn = 0;
    private double interestRate = 0;

    public double bankCharge() {
        double result = 4.5;
        if (daysOverdrawn > 0) {
            result += type.overDraftCharge(this);
        }
        return result;
    }

    double interestForAmount(double amount, int days) {
        return interestRate * amount * days / 365;
    }

    void setType(AccountType type) {
        this.type = type;
    }

    void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    void setDaysOverdrawn(int daysOverdrawn) {
        this.daysOverdrawn = daysOverdrawn;
    }
}
