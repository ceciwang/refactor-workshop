package com.thoughtworks.typecode;

abstract class Employee {

    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    protected Employee(int type) {
        this.setType(type);
    }

    protected static Employee create(int type) {
        switch (type){
            case ENGINEER:
                return new Engineer();
            case SALESMAN:
                return new Salesman();
            case MANAGER:
                return new Manager();
            default:
                throw new IllegalArgumentException("incorrect type code");
        }
    }

    abstract int getType();
    abstract int salary();

    public void setType(int type) {
    }
}
