package week3.day13.ClassObject;

public class CB {
    private int x;
    private String y;
    public CB(int x, String y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public String getY() {
        return y;
    }
    public void setY(String y) {
        this.y = y;
    }

    public void display(){
        System.out.println("Im in Class B");
        System.out.println(this.x);
        System.out.println(this.y);
    }

    
}
