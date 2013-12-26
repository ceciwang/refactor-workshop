package com.thoughtworks;

public class Engineer extends Employee{
    private int typeCode = Employee.ENGINEER;

    public Engineer() {
    }

    @Override
    public int getType(){
        return typeCode;
    }
}
