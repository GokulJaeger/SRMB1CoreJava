package com.srm.cjava.week1.day3;

abstract class Pen {
    public abstract void write();

    public abstract void refill();
}

public class FountainPen extends Pen {
    public void write() {
        System.out.println("Inside write method");
    }

    public void refill() {
        System.out.println("Inside Refill");
    }

    public void nib() {
        System.out.println("Inside Nib");
    }

    public static void main(String[] args) {
        FountainPen obj = new FountainPen();
        obj.write();
        obj.refill();
        obj.nib();

    }
}
