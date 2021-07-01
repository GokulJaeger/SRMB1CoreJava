package com.srm.cjava.week2.day8;

import java.util.ArrayList;

public class MinMAxArray {
    public static void main(String[] args) {
        
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(54);
        marks.add(75);
        marks.add(47);
        marks.add(89);
        marks.add(62);
        marks.add(98);
        marks.add(88);
        marks.add(94);
        marks.add(69);
        marks.add(78);
        marks.add(90);

        int max = marks.get(0);
        int min = marks.get(0);


        System.out.println("Marks added to the list!");
        System.out.println(marks.toString());
        System.out.println("Finding Max and Min marks in List:");

        for (int i : marks) {
            if(min>i){
                min = i;
            }
            if(max<i){
                max = i;
            }
            
        }

        System.out.println("Max Mark: " + max);

        System.out.println("Min Mark: " + min);

    }
}
