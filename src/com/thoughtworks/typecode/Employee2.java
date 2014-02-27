package com.thoughtworks.typecode;

public class Employee2 {

    Employee2Type type;
    private int monthlySalary = 100;
    private int commission = 200;
    private int bonus = 300;

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public int getCommission() {
        return commission;
    }

    public int getBonus() {
        return bonus;
    }

    public Employee2(int type) {
        this.setType(type);
    }

    public int salary(){
        return type.salary(this);
    }

    public void setType(int arg) {
        type = Employee2Type.newType(arg);
    }

}
