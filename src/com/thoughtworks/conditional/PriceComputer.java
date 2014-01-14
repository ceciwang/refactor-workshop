package com.thoughtworks.conditional;

import java.util.Date;

public class PriceComputer {

    private static final Date SUMMER_START = new Date();
    private static final Date SUMMER_END = new Date();
    private double winterRate;
    private double winterServiceCharge;
    private int quantity;
    private double summerRate;
    private int seniority;
    private int monthsDisabled;
    private boolean isPartTime;
    private double price;
    private double total;

    public double compute(Date date) {
        if(date.before(SUMMER_START) || date.after(SUMMER_END)){
           return quantity * winterRate + winterServiceCharge;
        }
        return quantity * summerRate;
    }

    public double disabilityAmount() {
        return (seniority < 2 || monthsDisabled > 12 || isPartTime) ? 0 : computeDisabilityAmount();
    }

    private double computeDisabilityAmount() {
        return quantity * winterRate + winterServiceCharge;
    }

    public double price(){
        if(onVocation()){
            if(lengthOfService() > 10) {
                return 1;
            }
        }
        return 0.5;
    }

    public void sendEmail(){
        if(isSpecialDeal()){
            total = price * 0.95;
            send();
        }
        else {
            total = price * 0.98;
            send();
        }
    }


    private boolean isSpecialDeal() {
        return false;
    }

    private void send() {
    }

    private int lengthOfService() {
        return 0;
    }

    private boolean onVocation() {
        return false;
    }
}
