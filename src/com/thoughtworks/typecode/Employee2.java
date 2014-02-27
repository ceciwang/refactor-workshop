package com.thoughtworks.typecode;

public class Employee2 {

    private Employee2Type type;

    public Employee2(int type) {
        this.setType(type);
    }

    public int salary(){
        switch (getType()){
            case Employee2Type.ENGINEER:
                return 100;
            case Employee2Type.SALESMAN:
                return 1000;
            case Employee2Type.MANAGER:
                return 10000;
            default:
                throw new RuntimeException("incorrect employee");
        }
    }

    public int getType() {
        return type.getTypeCode();
    }

    public void setType(int arg) {
        type = Employee2Type.newType(arg);
    }

}
