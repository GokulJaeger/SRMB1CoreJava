package com.srm.cjava.week2.day10;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class AccountInfo {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        TreeMap<Integer, Account> amap = new TreeMap<>();

        amap.put(4, new Account(1235489, 3632446.783));
        amap.put(5, new Account(83489, 877546.313));
        amap.put(9, new Account(568349, 76136.1713));
        amap.put(1, new Account(634563489, 178376.153));
        amap.put(3, new Account(3643639, 136346.933));
        amap.put(7, new Account(346534489, 75272611.573));
        amap.put(15, new Account(1234653459, 3117446.143));


        Set<Map.Entry<Integer, Account>> entries = amap.entrySet();

        for (Map.Entry<Integer, Account> entry : entries) {
            System.out.println(entry.getKey() + "=>" + entry.getValue());
        }


        System.out.println("Enter the Account Number:");
        long acc = sc.nextLong();

        for (Map.Entry<Integer, Account> ent : amap.entrySet()) {
            Account nacc = ent.getValue();

            if (acc  == nacc.getAccno()){
                System.out.println(ent.getKey() + "=>" + ent.getValue());
            }
        }

        sc.close();
    }
}
