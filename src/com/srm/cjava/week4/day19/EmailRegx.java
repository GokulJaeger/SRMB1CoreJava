package com.srm.cjava.week4.day19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRegx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email id: ");
        String phone = sc.next();
        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);
        if(matcher.matches()) {
           System.out.println("Email valid");
        } else {
           System.out.println("Email not valid");
        }

        sc.close();
     }
}
