package com.srm.cjava.week1.day3;

abstract class Telephone {
    public abstract void lift();

    public abstract void disconnected();
}

class SmartTelephone extends Telephone {
    public void lift() {
        System.out.println(("Inside Lift"));
    }

    public void disconnected() {
        System.out.println("Inside Disconnect");
    }
}

class tele {
    public static void main(String[] args) {
        Telephone obj = new SmartTelephone();
        obj.lift();
        obj.disconnected();
    }
}