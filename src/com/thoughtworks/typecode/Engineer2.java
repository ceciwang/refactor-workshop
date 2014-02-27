package com.thoughtworks.typecode;

public class Engineer2 extends Employee2Type {
    @Override
    int getTypeCode() {
        return ENGINEER;
    }

    public int salary(Employee2 employee){
        return employee.getMonthlySalary();
    }
}
