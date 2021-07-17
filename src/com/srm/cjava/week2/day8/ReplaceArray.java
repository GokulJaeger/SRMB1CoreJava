package week2.day8;

import java.util.ArrayList;
import java.util.Scanner;

public class ReplaceArray {
    public static void main(String[] args) {

        ArrayList<String> slist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        slist.add("Gokul");
        slist.add("KitKat");
        slist.add("COD");
        slist.add("Coding");
        slist.add("Eating");
        slist.add("Sleeping");
        slist.add("Gaming");
        slist.add("Exercise");
        slist.add("Movies");
        slist.add("Anime");

        System.out.println("The list of numbers are: \n");
        System.out.println(slist.toString());

        System.out.println("\nEnter the word to replace:");
        String str = sc.next();

        System.out.println("\nEnter the word to be replaced:");
        String str1 = sc.next();
        int key = -1;
        for (int i = 0; i < slist.size(); i++) {
            if (slist.get(i).equalsIgnoreCase(str)) {
                key = i;
            }
        }
        if (key < 0) {
            System.out.println("Word not found!.");
        } else {
            slist.add(key, str1);
        }

        System.out.println(slist.toString());
        System.out.println("Word replaced Successfully!");

        sc.close();
    }
}
