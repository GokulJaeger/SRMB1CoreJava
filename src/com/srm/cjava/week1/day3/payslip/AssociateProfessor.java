package com.srm.cjava.week1.day3.payslip;

public class AssociateProfessor extends Employee {
    int bp;

    void display() {
        System.out.println("/*-------Pay Slip-------*/");
        System.out.println("Basic: " + bp);
        System.out.println("DA: " + 0.97 * bp);
        System.out.println("HRA: " + 0.10 * bp);
        System.out.println("PF: " + 0.12 * bp);
        System.out.println("Fund: " + 0.001 * bp);

    }
}
