package com.srm.cjava.week2.day11;

import java.util.*;

class BinarySearch {
    public static void main(String[] args) {

        List<Domain> l = new ArrayList<Domain>();
        l.add(new Domain(10, "http://animetv.to"));
        l.add(new Domain(20, "https://github.com/GokulJaeger"));
        l.add(new Domain(30, "https://openweathermap.org/"));
        l.add(new Domain(40, "https://www.hackerrank.com/dashboard"));

        Comparator<Domain> c = new Comparator<Domain>() {
            public int compare(Domain u1, Domain u2) {
                return u1.getId().compareTo(u2.getId());
            }
        };

        int index = Collections.binarySearch(l, new Domain(10, "http://animetv.to"), c);
        check(index);


        index = Collections.binarySearch(l, new Domain(5, null), c);
        check(index);

        index = Collections.binarySearch(l, new Domain(5, "http://getpaid4Sleep.org"), c);
        check(index);
        
    }

    public static void check(int i){
        if (i == 0) {
            System.out.println("Found.");
        }
        else{
            System.out.println("Not Found");
        }
    }
}
