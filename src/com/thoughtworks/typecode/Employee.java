package com.thoughtworks.typecode;

class Employee {
    private int type;

    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    protected Employee(int type) {
        this.type = type;
    }
}
