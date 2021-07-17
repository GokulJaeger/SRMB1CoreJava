package week1.day5;

class Square extends Thread {
    int x;
    Square(int n) {
        this.x = n;
    }
    public void run() {
        int sqr = this.x * this.x;
        System.out.println("Square of " + x + " = " + sqr);
    }
}
