package com.thoughtworks.typecode;

public class Engineer extends Employee {

    public Engineer() {
        super(ENGINEER);
    }

    public int getType(){
        return Employee.ENGINEER;
    }

    @Override
    int salary() {
        return 100;
    }
}
