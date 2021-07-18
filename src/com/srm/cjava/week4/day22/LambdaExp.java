package day22;

import java.util.Arrays;
import java.util.List;

class LambdaExp {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Delhi", "Kolkata", "Chennai", "Mumbai");
        System.out.println("Print name of cities without using lambda");
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }
        System.out.println("Print name of cities using lambda");
        cities.forEach((city) -> {
            System.out.println(city);
        });
    }
}