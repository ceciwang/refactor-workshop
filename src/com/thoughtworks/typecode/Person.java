package com.thoughtworks.typecode;

public class Person {
    public static final int O = 0;
    public static final int A = 1;
    public static final int B = 2;
    public static final int C = 3;

    private int bloodGroup;

    public Person(int bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public int getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(int bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
}
