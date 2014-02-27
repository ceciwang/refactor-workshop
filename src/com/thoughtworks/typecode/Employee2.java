package com.thoughtworks.typecode;

public class Employee2 {

    private Employee2Type type;
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

    public Employee2(int type) {
        this.setType(type);
    }

    public int salary() {
        switch (getType()) {
            case Employee2Type.ENGINEER:
                return monthlySalary;
            case Employee2Type.SALESMAN:
                return monthlySalary + commission;
            case Employee2Type.MANAGER:
                return monthlySalary + bonus;
            default:
                throw new RuntimeException("incorrect employee");
        }
    }

    public int getType() {
        return type.getTypeCode();
    }

    public void setType(int arg) {
        type = Employee2Type.newType(arg);
    }

}
