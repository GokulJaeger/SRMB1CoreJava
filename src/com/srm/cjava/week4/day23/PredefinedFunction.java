package day23;

import java.util.function.Predicate;

public class PredefinedFunction {
    public static void main(String[] args) {
        Function<String, Integer> function = (s) -> s.length();
        System.out.println("Length of String:=> " + function.apply("Interface"));
        Predicate<Integer> predicate = (n) -> n % 2 == 0;
        boolean val = predicate.test(6);
        System.out.println("\nIs Even- " + val);
        System.out.println("\nIs Even- " + predicate.test(11));
    }
}
