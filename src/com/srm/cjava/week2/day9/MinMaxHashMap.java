package week2.day9;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class MinMaxHashMap {
    public static void main(String[] args) {
        HashMap<Integer,Integer>map=new HashMap<Integer, Integer>();
        map.put(10, 50);
        map.put(2, 60);
        map.put(3, 30);
        map.put(4, 60);
        map.put(5, 60);

        // int[] i = new int[map.size()];
        // int m=0;
        // for (Integer key:map.keySet()) {
        //     i[m] = key;
        //     m++;
        // }

        // int[] j = new int[map.size()];
        // int n=0;
        // for (Integer val:map.values()) {
        //     j[n] = val;
        //     n++;
        // }
        System.out.println("HashMap: ");
        System.out.println(map);
        
        int minValue=(Collections.min(map.values()));
        int maxKey = (Collections.max(map.keySet()));
        for (Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue()==minValue) {
                // System.out.println(entry.getKey());
            }
        }
        System.out.println("The Max key is: " + maxKey);
        System.out.println("The Min value is: " + minValue);
    }
}
