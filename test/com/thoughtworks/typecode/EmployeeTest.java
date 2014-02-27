package com.thoughtworks.typecode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class EmployeeTest {
    @Test
    public void should_return_salary_for_engineer(){
        Employee employee = Employee.create(Employee.ENGINEER);
        assertThat(employee.salary(), is(100));
    }

    @Test
    public void should_return_salary_for_salesman(){
        Employee employee = Employee.create(Employee.SALESMAN);
        assertThat(employee.salary(), is(1000));
    }

    @Test
    public void should_return_salary_for_manager(){
        Employee employee = Employee.create(Employee.MANAGER);
        assertThat(employee.salary(), is(10000));
    }
}
