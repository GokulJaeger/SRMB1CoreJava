package day19;

import java.lang.Class;
import java.lang.reflect.*;

class Anime {
    public void newAnimeList() {
        System.out.println("New Anime Release!");
        System.out.println("My Hero Academia Seasin 5\n");
    }

    protected void oldAnimeList() {
        System.out.println("Dr.Stone Season 2");
        System.out.println("Attack On Titans Season 3");
        System.out.println("Death Note 2");
        System.out.println("Pokemon Season 5");
    }
}

public class Reflx {
    public static void main(String[] args) {
        try {

            Anime a1 = new Anime();
            a1.newAnimeList();
            Class<? extends Anime> obj = a1.getClass();
            Method[] methods = obj.getDeclaredMethods();
            for (Method m : methods) {
                System.out.println("Method Name: " + m.getName());
                int modifier = m.getModifiers();
                System.out.println("Modifier: " + Modifier.toString(modifier));
                System.out.println("Return Types: " + m.getReturnType());
                System.out.println(" ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
