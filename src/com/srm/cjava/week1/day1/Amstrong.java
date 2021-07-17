package week1.day1;

import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        int b = 0;
        int a;
        int temp;
        System.out.println("Enter the number for armstrong check");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        temp = n;
        while (n > 0) {
            a = n % 10;
            n = n / 10;
            b = b + (a * a * a);
        }
        if (temp == b) {
            System.out.println("armstrong number");
        } else {
            System.out.println("Not armstrong number");
        }
        sc.close();
    }
}
