package com.thoughtworks.typecode;

public class Salesman extends Employee {

    public Salesman() {
        super(SALESMAN);
    }

    public int getType(){
        return Employee.SALESMAN;
    }

    @Override
    int salary() {
        return 1000;
    }
}
