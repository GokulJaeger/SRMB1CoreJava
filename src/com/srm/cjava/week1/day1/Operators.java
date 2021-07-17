package week1.day1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Operators {
    public static final Logger logg = Logger.getLogger(Operators.class.getName());

    public static void main(String[] args) {
        int n = 20;

        logg.log(Level.SEVERE, "Addition: {0}",add(23,25));
        logg.log(Level.SEVERE, "Subtraction: {0}",sub(23,25));
        logg.log(Level.SEVERE, "Multiplication: {0}",mul(23,25));
        logg.log(Level.SEVERE, "Division: {0}",div(23,25));
        logg.info("Value of N = 20");
        logg.log(Level.SEVERE, "PostIncreament: {0}",n++);
        logg.log(Level.SEVERE, "PostDecreament: {0}",n--);
        logg.log(Level.SEVERE, "PreIncreament: {0}", ++n);
        logg.log(Level.SEVERE, "PreDecreament: {0}", --n);
        
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static int sub(int a, int b){
        return a-b;
    }
    public static int mul(int a, int b){
        return a*b;
    }
    public static int div(int a, int b){
        return a/b;
    }
}
