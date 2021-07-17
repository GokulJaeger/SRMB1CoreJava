package week2.day8;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListCheck {
    public static void main(String[] args) {
        

        List<String> nlist = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        nlist.add("Gokul");
        nlist.add("KitKat");
        nlist.add("COD");
        nlist.add("Coding");
        nlist.add("Eating");
        nlist.add("Sleeping");
        nlist.add("Gaming");
        nlist.add("Exercise");
        nlist.add("Movies");
        nlist.add("Anime");

        System.out.println("\nEnter the word to check?");
        String str = sc.next();
        for(int i=0;i<nlist.size();i++){
            if(nlist.get(i).equalsIgnoreCase(str)){
                System.out.println(str + " is present at position " + i);
            }
        }
        System.out.println("Word Occured!.");
        System.out.println(nlist.toString());

        sc.close();
    }
}
