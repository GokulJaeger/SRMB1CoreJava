package week1.day5;

class Cube extends Thread{
    int x;
    Cube(int n){
        this.x = n;
    }
    public void run(){
        int cub = this.x * this.x * this.x;
        System.out.println("Cube of " + x + " = " + cub);
    }
}
