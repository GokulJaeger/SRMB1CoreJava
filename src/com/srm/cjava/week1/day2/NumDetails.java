package com.srm.cjava.week1.day2;

public class NumDetails {
    public static void main(String[] args) {
        NUmber n = new NUmber(23);
        System.out.println("Is Zero: " + n.zero());
        System.out.println("\nIs Positive: " + n.positive());
        System.out.println("\nIs Negative: " + n.negative());
        System.out.println("\nIs Odd: " + n.odd());
        System.out.println("\nIs Even: " + n.even());
        System.out.println("\nIs Prime: " + n.prime());
        System.out.println("\nIs Armstrong: " + n.armstrong());
        System.out.println("\nFactorial is: " + n.factorial());
        System.out.println("\nSquare is: " + n.sqr());
        System.out.println("\nSquare root is: " + n.sqrt());
        System.out.println("\nSum of Digits is: " + n.sumDigit());
        System.out.println("\nReverse Number :" + n.reverse());
        n.factor();
        n.binary();
    }
}
