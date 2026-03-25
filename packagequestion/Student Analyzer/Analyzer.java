package com.school.util;

import com.school.data.Student;

public class Analyzer {

    public double avg(Student s){
        return (s.m1+s.m2+s.m3)/3.0;
    }

    public String grade(double a){
        if(a>=75) return "A";
        else if(a>=50) return "B";
        else return "C";
    }
}