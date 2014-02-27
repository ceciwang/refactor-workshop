package com.thoughtworks.typecode;

public class Employee2 {

    private int type;

    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    private int monthlySalary;
    private int commission;
    private int bonus;

    public Employee2(int type) {
        this.type = type;
    }

    public int salary(){
        switch (type){
            case ENGINEER:
                return monthlySalary;
            case SALESMAN:
                return monthlySalary + commission;
            case MANAGER:
                return monthlySalary + bonus;
            default:
                throw new RuntimeException("incorrect employee");
        }
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

}

