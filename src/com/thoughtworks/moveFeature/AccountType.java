package com.thoughtworks.moveFeature;

public class AccountType {

    private boolean isPremium;

    public AccountType(boolean premium) {
        isPremium = premium;
    }

    public boolean isPremium() {
        return isPremium;
    }
}
