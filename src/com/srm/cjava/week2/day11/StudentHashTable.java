package com.srm.cjava.week2.day11;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;

public class StudentHashTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Hashtable<String, Integer> ht = new Hashtable<>();

        ht.put("Goku", 20);
        ht.put("Naruto", 30);
        ht.put("Levi", 25);
        ht.put("Deku", 15);
        ht.put("Tanjiro", 40);

        System.out.println("Original entries of hash table: " + ht);

        System.out.println("\nIterating keys of hash table:");
        Iterator<String> itr = ht.keySet().iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("\nIterating values of hash table:");
        Iterator<Integer> itrValue = ht.values().iterator();
        while (itrValue.hasNext()) {
            System.out.println(itrValue.next());
        }

        System.out.println("\nIterating entries of hash table:");

        Iterator<Entry<String, Integer>> itrEntry = ht.entrySet().iterator();
        while (itrEntry.hasNext()) {
            System.out.println(itrEntry.next());
        }

        System.out.println("\nEnter the key to replace: ");
        String ikey = sc.next();

        System.out.println("\nEnter the value to be replaced: ");
        int age = sc.nextInt();

        if (ht.replace(ikey, age) != null) {
            System.out.println("Replaced!");
        } else {
            System.out.println("Key not found");
        }

        System.out.println(ht);

        sc.close();

    }
}
