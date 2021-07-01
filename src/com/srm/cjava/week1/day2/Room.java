package com.srm.cjava.week1.day2;

public class Room {
    private int roomno;
    private String roomtype;
    private int roomarea;
    private boolean ac;

    public void setData(int no, String type, int area, boolean ac){
        this.roomno = no;
        this.roomtype = type;
        this.roomarea = area;
        this.ac = ac; 
    }

    public void displayData(){
        System.out.println("The Room no: " + this.roomno);
        System.out.println("The Room type: " + this.roomtype);
        System.out.println("The Room area: " + this.roomarea);
        System.out.println("AC Available: " + this.ac);
    }
}
