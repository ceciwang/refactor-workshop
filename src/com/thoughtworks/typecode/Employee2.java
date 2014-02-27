package com.thoughtworks.typecode;

public class Employee2 {

    private int type;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    public Employee2(int type) {
        this.type = type;
    }

    public int salary(){
        switch (type){
            case ENGINEER:
                return 100;
            case SALESMAN:
                return 1000;
            case MANAGER:
                return 10000;
            default:
                throw new RuntimeException("incorrect employee");
        }
    }
}
