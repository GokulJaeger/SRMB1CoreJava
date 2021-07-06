package com.srm.cjava.week3.day13;

import java.util.Scanner;

public class ReplaceChar {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter:");
        String str = sc.nextLine();

        String new_str = str.replace('d', 'f');
        System.out.println("Original string: " + str);
        System.out.println("New String: " + new_str);

        sc.close();
    }
}
