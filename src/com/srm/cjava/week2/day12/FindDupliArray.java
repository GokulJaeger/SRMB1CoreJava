package week2.day12;

import java.util.TreeSet;

public class FindDupliArray {
    public static void main(String[] args) {
        String[] strArr = { "Goku", "Vegeta", "Naruto", "Eren", "Levi", "Ash", "Deku", "All Might", "Endeavor", "Goku",
                "Tranjiro", "Naruto", "Sasuke" };

        TreeSet<String> ts = new TreeSet<String>();
        System.out.println("Duplicates: ");

        for (String str : strArr) {
            if (ts.add(str) == false) {
                System.out.println(str);
            }
        }
    }
}
