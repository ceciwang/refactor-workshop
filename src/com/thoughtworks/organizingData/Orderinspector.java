package com.thoughtworks.organizingData;

import java.util.Collection;
import java.util.Iterator;

public class OrderInspector {

    public static int numberOfOrderFor(Collection orders, String customer) {
        int result = 0;
        Iterator iterator = orders.iterator();
        while (iterator.hasNext()) {
            Order each = (Order) iterator.next();
            if (each.getCustomer().equals(customer)) result++;
        }
        return result;
    }

}
