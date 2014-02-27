package com.thoughtworks.typecode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Employee2Test {
    @Test
    public void should_return_salary_for_engineer(){
        Employee2 employee = new Employee2(Employee.ENGINEER);
        employee.setCommission(100);
        employee.setMonthlySalary(200);
        employee.setBonus(300);
        assertThat(employee.salary(), is(200));
    }

    @Test
    public void should_return_salary_for_salesman(){
        Employee2 employee = new Employee2(Employee.SALESMAN);
        employee.setCommission(100);
        employee.setMonthlySalary(200);
        employee.setBonus(300);
        assertThat(employee.salary(), is(300));
    }

    @Test
    public void should_return_salary_for_manager(){
        Employee2 employee = new Employee2(Employee.MANAGER);
        employee.setCommission(100);
        employee.setMonthlySalary(200);
        employee.setBonus(300);
        assertThat(employee.salary(), is(500));
    }

}
