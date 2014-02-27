package com.thoughtworks.typecode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Employee2Test {
    @Test
    public void should_return_salary_for_engineer(){
        Employee2 employee = new Employee2(Employee2Type.ENGINEER);
        employee.setMonthlySalary(100);
        employee.setCommission(200);
        employee.setBonus(300);
        assertThat(employee.salary(), is(100));
    }

    @Test
    public void should_return_salary_for_salesman(){
        Employee2 employee = new Employee2(Employee2Type.SALESMAN);
        employee.setMonthlySalary(100);
        employee.setCommission(200);
        employee.setBonus(300);
        assertThat(employee.salary(), is(300));
    }

    @Test
    public void should_return_salary_for_manager(){
        Employee2 employee = new Employee2(Employee2Type.MANAGER);
        employee.setMonthlySalary(100);
        employee.setCommission(200);
        employee.setBonus(300);
        assertThat(employee.salary(), is(400));
    }

}
