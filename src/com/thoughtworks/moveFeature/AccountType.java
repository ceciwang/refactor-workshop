package com.thoughtworks.moveFeature;

public class AccountType {

    private boolean isPremium;

    public AccountType(boolean premium) {
        isPremium = premium;
    }

    public boolean isPremium() {
        return isPremium;
    }

    double overDraftCharge(Account account) {
        if (isPremium()) {
            double result = 10;
            if (account.daysOverdrawn > 7) {
                result += (account.daysOverdrawn - 7) * 0.85;
            }
            return result;
        } else
            return account.daysOverdrawn * 1.75;

    }
}
