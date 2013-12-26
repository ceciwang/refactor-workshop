package com.thoughtworks;

public class Person {
    private BloodGroup bloodGroup;

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public Person(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

}
