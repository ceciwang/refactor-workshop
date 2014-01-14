package com.thoughtworks.conditional;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CapitalCalculatorTest {
    @Test
    public void should_return_0_when_have_no_capital(){
        CapitalCalculator calculator = new CapitalCalculator(0.0, 200, 0.1, 10);
        assertThat(calculator.getAdjustedCapital(), is(0.0));
    }
    @Test
    public void should_return_0_when_have_no_intRate(){
        CapitalCalculator calculator = new CapitalCalculator(100, 200, 0.0, 10);
        assertThat(calculator.getAdjustedCapital(), is(0.0));
    }
    @Test
    public void should_return_0_when_have_no_duration(){
        CapitalCalculator calculator = new CapitalCalculator(100, 200, 0.1, 0.0);
        assertThat(calculator.getAdjustedCapital(), is(0.0));
    }

    @Test
    public void should_calculate_result(){
        CapitalCalculator calculator = new CapitalCalculator(100, 200, 0.1, 10);
        assertThat(calculator.getAdjustedCapital(), is(2.0));
    }
}
