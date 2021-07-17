package week2.day12;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableIterator {
    public static void main(String[] args) {
 
        Integer str;
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        hashtable.put(564, "GOKU");
        hashtable.put(65463, "EREN");
        hashtable.put(8645, "LEVI");
        hashtable.put(9321, "DEKU");
        hashtable.put(3451, "NARUTO");
     
        System.out.println("Hashtable contains:");

        Set<Integer> keys = hashtable.keySet();

        Iterator<Integer> itr = keys.iterator();

        while (itr.hasNext()) { 
           str = itr.next();
           System.out.println("Key: "+str+" & Value: "+hashtable.get(str));
        } 
     }
}
