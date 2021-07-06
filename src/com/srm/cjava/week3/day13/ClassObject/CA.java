package com.srm.cjava.week3.day13.ClassObject;

public class CA {
    private int a;
    private int b;
    public CA(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }

    public void display(){
        System.out.println("Im in Class A");
        System.out.println(this.a);
        System.out.println(this.b);
    }

    
}
