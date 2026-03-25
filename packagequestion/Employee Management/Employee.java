package com.company.hr;

public class Employee {

    private int id;
    private String name;
    private String dept;
    private double salary;

    public void set(int i,String n,String d,double s){
        id=i; name=n; dept=d; salary=s;
    }

    public double getSalary(){
        return salary;
    }

    public void display(){
        System.out.println(id+" "+name+" "+dept+" "+salary);
    }
}