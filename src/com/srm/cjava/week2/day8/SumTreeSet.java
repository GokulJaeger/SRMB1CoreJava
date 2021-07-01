package com.srm.cjava.week2.day8;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SumTreeSet {

    private static int su = 0;
    public static void main(String[] args) {
        
        Set<Integer> nums = new TreeSet<>();
        int sum1 = 0;
        nums.add(54);
        nums.add(75);
        nums.add(47);
        nums.add(89);
        nums.add(62);
        nums.add(98);
        nums.add(88);
        nums.add(94);
        nums.add(69);
        nums.add(90);

        for (Integer i : nums) {
            sum1+=i;
        }
        System.out.println("Numbers in TreeSet: " + nums.toString());

        System.out.println("\nThe Sum of TreeSet using for-each loop: " + sum1);

        int sum2 = 0;
        Iterator<Integer> itr1 = nums.iterator();
        while(itr1.hasNext()){
            sum2+=itr1.next();
        }

        System.out.println("Adding two more elements to TreeSet 34 & 59:");
        // nums.add(34);
        // nums.add(59);

        System.out.println("Numbers in TreeSet after update: " + nums.toString());

        System.out.println("\nThe Sum of TreeSet using while loop: " + sum2);

        Iterator<Integer> itr2 = nums.iterator();
        System.out.println("\nThe Sum of TreeSet using recursion: " + sum3(itr2));

    }

    public static int sum3(Iterator<Integer> inum) {
        
        while(inum.hasNext()){
            su+=inum.next();
            return sum3(inum);
        }
        return su;
    }
}
