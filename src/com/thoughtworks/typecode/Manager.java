package com.thoughtworks.typecode;

public class Manager extends Employee {

    public Manager() {
        super(MANAGER);    //To change body of overridden methods use File | Settings | File Templates.
    }

    public int getType(){
        return Employee.MANAGER;
    }

    @Override
    int salary() {
        return 10000;
    }
}
