package Assessment;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Integer:");
        int n = sc.nextInt();
        int actual = n;

        int sum = 0;
        if (n > 0) {
            while (n != 0) {
                int temp = n % 10;
                sum += temp;
                n = n / 10;
            }
        } else {
            System.out.println("No negative integers");
        }
        System.out.println("\nThe Sum of Digit " + actual + " are:" + sum);

        sc.close();
    }
}
