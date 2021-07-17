package week1.day1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PrimeSum {
    private static final Logger logg = Logger.getLogger(PrimeSum.class.getName());
    public static void main(String[] args) {
        primeCheck(234);

        sumCheck(123546);
    }

    public static void primeCheck(int a){
        int i;
        int m = 0;
        int flag = 0;
        int n = a;
        m = n / 2;
        if (n == 0 || n == 1) {
            logg.log(Level.INFO, "{0} is not prime number",n);
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    logg.log(Level.INFO, "{0} is not prime number",n);
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                logg.log(Level.INFO, "{0} is a prime number",n);
            }
        }
    }

    public static void sumCheck(int a){
        int n = a;
        int sum = 0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        logg.log(Level.INFO, "Sum of is: {0}",sum);
    }
}
