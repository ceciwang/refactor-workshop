package com.thoughtworks.organizingData;

public class Customer {
    private final String name;

    private Customer(String name) {
        this.name = name;
    }

    public static Customer createCustomer(String name) {
        return new Customer(name);
    }

    String getName() {
        return name;
    }
}
