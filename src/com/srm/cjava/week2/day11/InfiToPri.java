package com.srm.cjava.week2.day11;

public class InfiToPri{
    public static void main(String[] args) {
        String exp = "A+B*(C^D-E)";
        System.out.println("Infix Expression: " + exp);
        System.out.println("Prefix Expression: " + Notations.infixToPreFix(exp));
        System.out.println("Postfix Expression: " + Notations.infixToPostFix(exp));
    }
}