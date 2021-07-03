package com.srm.cjava.week2.day10;

public class Account {
    private long accno;
    private double bal;

    public Account(long accno, double bal) {
        this.accno = accno;
        this.bal = bal;
    }

    public long getAccno() {
        return accno;
    }

    public void setAccno(long accno) {
        this.accno = accno;
    }

    public double getBal() {
        return bal;
    }

    public void setBal(double bal) {
        this.bal = bal;
    }

    @Override
    public String toString() {
        return "Account [accno=" + accno + ", bal=" + bal + "]";
    }

}
