package com.company.payroll;

import com.company.hr.Employee;

public class Payroll {

    public double bonus(Employee e){
        return e.getSalary()*0.1;
    }
}