package week1.day6;

public class GenericFunction {

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Maximum of [78, 57, 58] is: " + maximum(78, 57, 58));
        System.out.println("Maximum of [6.6213, 8.889, 7.7354] is: " + maximum(6.6213, 8.889, 7.7354));
        System.out.println("Maximum of [pear, apple, orange] is: " + maximum("pear", "apple", "orange"));
    }
}