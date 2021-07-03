package com.srm.cjava.week2.day11;

import java.util.Enumeration;
import java.util.Vector;

public class VectorAddMulti {
    public static void main(String[] args) {
        

        Vector<Integer> vs = new Vector<>();
        vs.add(45);
        vs.add(78);
        vs.add(95);
        vs.add(32);
        vs.add(96);
        vs.add(24);
        vs.add(50);

        Vector<Integer> vq = new Vector<>();

        vq.add(34);
        vq.add(7);
        vq.add(8);
        vq.add(3);



        System.out.println("Stock Vector:");
        System.out.println(vs);

        vs.add(5,100);
        vs.add(3,1000);

        System.out.println("\n Vector after adding two elements: ");
        System.out.println(vs);

        System.out.println("\nAdding vector elements: ");
        Enumeration<Integer> en = vs.elements();
        int sum = 0;
        long mul = 1;
        while(en.hasMoreElements()){
            sum+=en.nextElement();
        }

        System.out.println("\nRemoving two elements from Vector:");
        vs.removeElementAt(5);
        vs.removeElementAt(3);
        System.out.println(vs);

        Enumeration<Integer> en1 = vs.elements();

        while(en1.hasMoreElements()){
            mul*=en1.nextElement();
        }

        System.out.println("\n The Sum of Vector elements are: " + sum);
        System.out.println("\n The Product of Vector elements are: " + mul);

        Vector<Integer> vnew = new Vector<>();

        Enumeration<Integer> en2 = vq.elements();
        while(en2.hasMoreElements()){
            int n = 3* en2.nextElement();
            vnew.add(n);
        }
        System.out.println(vnew);

        }
    }
