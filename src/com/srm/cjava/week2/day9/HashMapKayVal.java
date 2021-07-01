package com.srm.cjava.week2.day9;

import java.util.HashMap;

public class HashMapKayVal {
    public static void main(String[] args) {
        HashMap<String, String> employeeDeptmap = new HashMap<>();

        boolean empty = employeeDeptmap.isEmpty();
        System.out.println("is employeeDeptmap empty: " + empty);

        employeeDeptmap.put("Arpit", "Tech");
        employeeDeptmap.put("John", "Sales");
        employeeDeptmap.put("Martin", "HR");
        employeeDeptmap.put("Vaibhav", "Tech");

        System.out.println(employeeDeptmap);
        System.out.println("size of employeeDeptmap: " + employeeDeptmap.size());
        System.out.println("Martin's department: " + employeeDeptmap.get("Martin"));

        System.out.println("Robin's department: " + employeeDeptmap.get("Robin"));

        if (employeeDeptmap.containsKey("John")) {
            System.out.println("employeeDeptmap has John as key");
        }

        if (employeeDeptmap.containsValue("Sales")) {
            System.out.println("employeeDeptmap has Sales as value");
        }
        employeeDeptmap.clear();
        System.out.println(employeeDeptmap);
    }
}
