package com.thoughtworks.conditional;

public class Manager extends Employee{
    public Manager() {
    }

    @Override
    public int getType(){
        return MANAGER;
    }
}
