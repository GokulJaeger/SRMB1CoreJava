package week1.day3;

class Shape {
    public void printshape() {
        System.out.println("This is shape");
    }
}

class Rectangle extends Shape {
    public void printrect() {
        System.out.println("This is rectangular shape");
    }
}

class Circle extends Shape {
    public void printcircle() {
        System.out.println("This is circular shape");
    }
}

class Square extends Rectangle {
    public void printsquare() {
        System.out.println("Square is a rectangle");
    }
}

public class Shapes {
    public static void main(String[] args) {
        Square ob = new Square();
        System.out.println("Printing Shapes of Laddu");
        ob.printshape();
        ob.printrect();
    }
}
