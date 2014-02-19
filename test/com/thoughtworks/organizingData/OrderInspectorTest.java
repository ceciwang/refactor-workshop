package com.thoughtworks.organizingData;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class OrderInspectorTest {
    @Test
    public void should_get_order_count_for_customer(){
        List<Order> orders = Arrays.asList(new Order("wang"));
        int result = OrderInspector.numberOfOrderFor(orders, "wang");
        assertThat(result, is(1));
    }
}
