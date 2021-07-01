package com.srm.cjava.week1.day5;

import java.util.Random;

class NUmber extends Thread {
    public void run() {
        Random random = new Random();
        int randomInteger = random.nextInt(100);
        System.out.println("Random Integer generated : " + randomInteger);
        if (randomInteger % 2 == 0) {
            Square s = new Square(randomInteger);
            s.start();
        } else {
            Cube c = new Cube(randomInteger);
            c.start();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }
}