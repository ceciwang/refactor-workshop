package com.thoughtworks.typecode;

public abstract class Employee2Type {
    abstract int getTypeCode();

    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    static Employee2Type newType(int arg) {
        switch (arg){
            case ENGINEER:
                return new Engineer2();
            case SALESMAN:
                return new Salesman2();
            case MANAGER:
                return new Manager2();
            default:
                throw new IllegalArgumentException("incorrect type code");
        }
    }

    abstract int salary(Employee2 employee);
}
