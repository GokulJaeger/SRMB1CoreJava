package com.srm.cjava.week1.day2;

public class Distance {
    public static void main(String[] args) {
        Point p1 = new Point(5, 9);
        Point p2 = new Point(3, 8);
        distanceCal(p1,p2);

    }

    public static void distanceCal(Point p, Point q) {

        double dis;

        double pp1 = Math.pow((q.getX() - p.getX()), 2);
        double pp2 = Math.pow((q.getY() - p.getY()), 2);
        double po = pp1 + pp2;
        dis = Math.sqrt(po);
        System.out.println("The distance is: " + dis);
    }
}
