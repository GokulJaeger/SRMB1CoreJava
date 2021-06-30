package com.srm.cjava.week1.day1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ControlStatements {
    private static final Logger logg = Logger.getLogger(ControlStatements.class.getName());

    public static void main(String[] args) {
        int a = 13;
        int b = 23;
        int c = 9;
        logg.log(Level.SEVERE, "a={0}", a);
        logg.log(Level.SEVERE, "b={0}", b);
        logg.log(Level.SEVERE, "c={0}", c);

        if (a > b) {
            if (a > c) {
                logg.log(Level.SEVERE, "a is greater");
            }
            else{
                logg.log(Level.SEVERE, "c is greater");
            }
        }
        else if(b>c){
            logg.log(Level.SEVERE,"b is greater");
        }


        int n=100;
        logg.info("Two digit multiples of 3!");
        for(int i=0;i<n;i++){
            if(i%3==0){
                logg.log(Level.SEVERE,"i = {0}",Integer.toString(i));
            }
        }
    }
}
