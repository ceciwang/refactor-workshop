package com.thoughtworks;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class PayAmountCalculatorTest {
    @Test
    public void should_return_normal_payment(){
        PayAmountCalculator calculator = new PayAmountCalculator(false, false, false);
        assertThat(calculator.amount(), is(200));
    }
    @Test
    public void should_return_dead_payment(){
        PayAmountCalculator calculator = new PayAmountCalculator(true, false, false);
        assertThat(calculator.amount(), is(400));
    }
    @Test
    public void should_return_separated_payment(){
        PayAmountCalculator calculator = new PayAmountCalculator(false, true, false);
        assertThat(calculator.amount(), is(300));
    }
    @Test
    public void should_return_retired_payment(){
        PayAmountCalculator calculator = new PayAmountCalculator(false, false, true);
        assertThat(calculator.amount(), is(100));
    }
}
