package com.srm.cjava.week2.day12;

public class MyOwnClass {
    private String name;
    private int age;

    
    public MyOwnClass(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public int getEid() {
        return age;
    }
    public void setEid(int eid) {
        this.age = eid;
    }
    public String getEname() {
        return name;
    }
    public void setEname(String ename) {
        this.name = ename;
    }
    @Override
    public String toString() {
        return "MyOwnClass [age=" + age + ", name=" + name + "]";
    }
    
}
