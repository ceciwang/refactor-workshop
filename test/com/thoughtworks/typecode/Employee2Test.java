package com.thoughtworks.typecode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Employee2Test {
    @Test
    public void should_return_salary_for_engineer(){
        Employee2 employee = new Employee2(Employee.ENGINEER);
        assertThat(employee.salary(), is(100));
    }

    @Test
    public void should_return_salary_for_salesman(){
        Employee2 employee = new Employee2(Employee.SALESMAN);
        assertThat(employee.salary(), is(1000));
    }

    @Test
    public void should_return_salary_for_manager(){
        Employee2 employee = new Employee2(Employee.MANAGER);
        assertThat(employee.salary(), is(10000));
    }

}
