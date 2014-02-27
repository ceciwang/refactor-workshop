package com.thoughtworks.typecode;

class Employee {
    private int type;

    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    protected Employee(int type) {
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
                return 0;
        }
    }
}
