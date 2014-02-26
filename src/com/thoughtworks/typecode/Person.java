package com.thoughtworks.typecode;

public class Person {
    private BloodGroup bloodGroup;

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public Person(BloodGroup bloodGroup) {

        this.bloodGroup = bloodGroup;
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;

    }
}
