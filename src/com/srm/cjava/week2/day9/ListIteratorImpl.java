package week2.day9;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorImpl {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Gokul");
        list.add("Sachin");
        list.add("Sweatha");

        System.out.println("List: " + list);

        ListIterator<String> iterator = list.listIterator();
        System.out.println("List Iterator in Forward Direction:");

        boolean elementsPresent = iterator.hasNext();
        System.out.println(elementsPresent);

        int ia = iterator.nextIndex();
        String ea = iterator.next();
        System.out.println("Index= " + ia + " Element :" + ea);

        int ib = iterator.nextIndex();
        String eb = iterator.next();
        System.out.println("Index= " + ib + " Element: " + eb);

        int ic = iterator.nextIndex();
        String ec = iterator.next();
        System.out.println("Index= " + ic + " Element: " + ec);

        boolean elementsPresent2 = iterator.hasNext();
        System.out.println(elementsPresent2);
        if (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

    }
}
