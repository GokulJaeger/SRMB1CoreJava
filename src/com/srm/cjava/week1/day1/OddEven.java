package com.srm.cjava.week1.day1;

import java.util.ArrayList;

public class OddEven {
    
    public static void main(String[] args) {
        int n = 543151654;

        System.out.println("The number: " + n);

        int temp;
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        while(n!=0){
            temp = n%10;
            if(temp%2==0){
                even.add(temp);
            }
            else{
                odd.add(temp);
            }
            n/=10;
        }

        System.out.println("Even number:" + even);
        System.out.println("\nOdd number:" + odd);
    }
}
