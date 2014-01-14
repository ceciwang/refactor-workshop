package com.thoughtworks.conditional;

public class Engineer extends Employee{
    private int typeCode = ENGINEER;

    public Engineer() {
    }

    @Override
    public int getType(){
        return typeCode;
    }
}
