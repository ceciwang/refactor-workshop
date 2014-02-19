package com.thoughtworks.organizingData;

public class Order {
    public Order(String customer) {
        this.customer = Customer.createCustomer(customer);
    }

    public String getCustomer() {
        return customer.getName();
    }

    public void setCustomer(String customer) {
        this.customer = Customer.createCustomer(customer);
    }

    private Customer customer;
}

