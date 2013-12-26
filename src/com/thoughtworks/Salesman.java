package com.thoughtworks;

public class Salesman extends Employee{
    public Salesman() {
    }

    @Override
    public int getType(){
        return Employee.SALESMAN;
    }
}
