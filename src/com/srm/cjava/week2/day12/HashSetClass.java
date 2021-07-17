package week2.day12;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {
    public static void main(String[] args) {
        

        HashSet<MyOwnClass> hs = new HashSet<>();

        hs.add(new MyOwnClass(24, "Gokul"));
        hs.add(new MyOwnClass(23, "Natsu"));
        hs.add(new MyOwnClass(74, "Simo"));
        hs.add(new MyOwnClass(64, "Negi"));

        Iterator<MyOwnClass> ic = hs.iterator();

        while(ic.hasNext()){
            System.out.println(ic.next());

        }

    }
    
}
