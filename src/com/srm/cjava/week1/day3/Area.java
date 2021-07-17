package week1.day3;

class Rectanglee {
    protected int length;
    protected int breadth;

    Rectanglee(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    public void arear() {
        System.out.println("Area of rectangle: " + (this.length * this.breadth));
    }

    public void perir() {
        System.out.println("Perimeter of rectangle: " + (2 * (this.length + this.breadth)));
    }

}

class Squaree extends Rectanglee {
    protected int a;

    Squaree(int l, int b, int a) {
        super(l, b);
        this.a = a;
    }

    public void areas() {
        System.out.println("Area of square: " + (this.a * this.a));
    }

}

class Area {
    public static void main(String[] args) {
        Squaree ob = new Squaree(10,15,20);
        ob.arear();
        ob.perir();
        ob.areas();
    }
}
