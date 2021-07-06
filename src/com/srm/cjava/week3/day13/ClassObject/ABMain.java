package com.srm.cjava.week3.day13.ClassObject;

public class ABMain {
    public static void main(String[] args) {

        CA c1 = new CA(45, 67);
        CB c2 = new CB(23, "Gokul");

        c1.display();
        c2.display();

        Object obj1 = new Object();

        Object obj2  = new Object();
        obj1 = c1.getClass();
        System.out.println("CA class: " + obj1);
        obj2 = c2.getClass();
        System.out.println("CB class: " + obj2);
    }
}
