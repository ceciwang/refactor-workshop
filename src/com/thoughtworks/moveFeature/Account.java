package com.thoughtworks.moveFeature;

 class Account {
    private AccountType type;
    private int daysOverdrawn = 0;
    private double interestRate = 0;

    double interestForAmount(double amount, int days){
        return type.getInterestRate() * amount * days /365;
    }

    double bankCharge(){
        double result = 4.5;
        if(daysOverdrawn > 0) {
            result += type.overDraftCharge(daysOverdrawn);
        }
        return result;
    }

}
