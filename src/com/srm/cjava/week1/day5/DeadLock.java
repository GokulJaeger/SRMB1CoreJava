package week1.day5;

public class DeadLock {
    final static Object res1 = new Object();
    final static Object res2 = new Object();

    public static void main(String[] args) throws InterruptedException {
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        myThread1.start();
        myThread2.start();
        Thread.sleep(3000);
        System.out.println("State of the thread 1 is " + myThread1.getState());
        System.out.println("State of the thread 2 is " + myThread2.getState());
    }
}

class MyThread1 extends Thread {
    public void run() {
        synchronized (DeadLock.res1) {
            System.out.println("Thread 1 locked shared resources A");
            synchronized (DeadLock.res2) {
                System.out.println("Thread 1 locked shared resources B");
            }
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        synchronized (DeadLock.res2) {
            System.out.println("Thread 2 locked shared resources B");
            synchronized (DeadLock.res1) {
                System.out.println("Thread 2 locked shared resources A");
            }
        }
    }
}
