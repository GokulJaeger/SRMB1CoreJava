package week2.day12;

import java.util.ArrayList;
import java.util.List;

public class StringRemove {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Goku");
        names.add("Vegeta");
        names.add("Naruto");
        names.add("Eren");
        names.add("Levi");
        names.add("Ash");
        names.add("Deku");
        names.add("All Might");
        names.add("Endeavor");
        names.add("Goku");
        names.add("Naruto");
        names.add("Tranjiro");
        names.add("Sasuke");

        System.out.println("ArrayList: " + names);

        List<String> newlist = removeEle(names);

        System.out.println("Removing event length elements" + newlist);

        
    }

    public static List<String> removeEle( List<String> stringList ) {
        List<String> oddList = new ArrayList<String>();
        for( String word : stringList ) {
            if( word.length() % 2 == 1 ) {
                oddList.add( word );
            }
        }
        return oddList;
    }
}
