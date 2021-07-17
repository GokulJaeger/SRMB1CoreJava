package week3.day18.serialization;

import java.io.Serializable;

public class Employee implements Serializable {
    private int eid;
    private String ename;
    private int age;
    private String desig;
    private double sal;
    public Employee(int eid, String ename, int age, String desig, double sal) {
        this.eid = eid;
        this.ename = ename;
        this.age = age;
        this.desig = desig;
        this.sal = sal;
    }
    public int getEid() {
        return eid;
    }
    public void setEid(int eid) {
        this.eid = eid;
    }
    public String getEname() {
        return ename;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getDesig() {
        return desig;
    }
    public void setDesig(String desig) {
        this.desig = desig;
    }
    public double getSal() {
        return sal;
    }
    public void setSal(double sal) {
        this.sal = sal;
    }
    @Override
    public String toString() {
        return "Employee [ Name=" + ename + ", ID=" + eid + ", Age=" + age + ", Designation=" + desig + ", Salary=" + sal + "]";
    }

    
}
