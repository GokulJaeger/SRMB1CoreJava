package com.srm.cjava.week2.day9;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorImp {
    public static void main(String args[]){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Gokul");
        names.add("KitKat");
        names.add("COD");
        names.add("Coding");
        names.add("Eating");
        names.add("Sleeping");
        names.add("Gaming");
        names.add("Exercise");
        names.add("Movies");
        names.add("Anime");
     
        Iterator<String> it = names.iterator();
     
        while(it.hasNext()) {
          String obj = it.next();
          System.out.println(obj);
        }
     }
}
