package com.thoughtworks;

public class Manager extends Employee{
    public Manager() {
    }

    @Override
    public int getType(){
        return Employee.MANAGER;
    }
}
