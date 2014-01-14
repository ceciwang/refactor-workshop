package com.thoughtworks.organizingData;

import java.util.Collection;
import java.util.Iterator;

public class Order {
    private Customer customer;

    public Order(String name) {
        this.customer = Customer.create(name);
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public void setCustomerName(String customer) {
        this.customer = Customer.create(customer);
    }
}

class Canary{
    private static int numberOfOrderFor(Collection orders, String customer){
        int result = 0;
        Iterator iterator = orders.iterator();
        while (iterator.hasNext()){
            Order each = (Order)iterator.next();
            if(each.getCustomerName().equals(customer)) result ++;
        }
        return result;
    }

}

