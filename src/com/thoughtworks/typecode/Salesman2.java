package com.thoughtworks.typecode;

public class Salesman2 extends Employee2Type {
    @Override
    int getTypeCode() {
        return SALESMAN;
    }

    public int salary(Employee2 employee){
        return employee.getMonthlySalary() + employee.getCommission();
    }
}
