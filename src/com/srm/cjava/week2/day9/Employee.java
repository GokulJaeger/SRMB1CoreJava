package com.srm.cjava.week2.day9;

public class Employee {
    private int eno;
    private String name;
    private String desig;


    public Employee(int eno, String name, String desig) {
        this.eno = eno;
        this.name = name;
        this.desig = desig;
    }

    public int getEno() {
        return eno;
    }


    public void setEno(int eno) {
        this.eno = eno;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getDesig() {
        return desig;
    }


    public void setDesig(String desig) {
        this.desig = desig;
    }

    @Override
    public String toString() {
        return "Employee Details:\n[Employee No: " + eno + ", Employee Name=" + name + ", Designation: " + desig + "]";
    }
    
}
