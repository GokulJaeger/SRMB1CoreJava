package com.srm.cjava.week2.day10;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Directory {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TreeMap<Integer, PhoneDirectory> pd = new TreeMap<>();

        pd.put(234, new PhoneDirectory("Goku", 987548647));
        pd.put(456, new PhoneDirectory("Naruto", 987548647));
        pd.put(154, new PhoneDirectory("Eren", 634548647));
        pd.put(789, new PhoneDirectory("Deku", 786722647));
        pd.put(963, new PhoneDirectory("Tanjiro", 72548647));
        pd.put(878, new PhoneDirectory("KickMuscle", 882548647));
        pd.put(789, new PhoneDirectory("Sasuke", 245255447));
        pd.put(354, new PhoneDirectory("Vegeta", 987589377));
        pd.put(257, new PhoneDirectory("Levi", 727548647));

        Set<Map.Entry<Integer, PhoneDirectory>> entries = pd.entrySet();

        for (Map.Entry<Integer, PhoneDirectory> entry : entries) {
            System.out.println(entry.getKey() + "=>" + entry.getValue());
        }

        System.out.println("Enter the Phone Number: ");
        long num = sc.nextLong();

        for (Map.Entry<Integer, PhoneDirectory> ent : pd.entrySet()) {
            PhoneDirectory npd = ent.getValue();

            if (num == npd.getPhone()) {
                System.out.println(ent.getKey() + "=>" + ent.getValue());
            }
        }

        System.out.println("Enter the Name: ");
        String nam = sc.next();

        for (Map.Entry<Integer, PhoneDirectory> ent : pd.entrySet()) {
            PhoneDirectory npd = ent.getValue();

            if (nam.equalsIgnoreCase(npd.getName())){
                System.out.println(ent.getKey() + "=>" + ent.getValue());
            }
        }

        sc.close();
    }
}
