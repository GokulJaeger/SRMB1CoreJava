package com.srm.cjava.week1.day2;

public class Consumer {
    private int cono;
    private String name;
    private int pre;
    private int post;
    private String type;
    private int unit;
    private double price;

    public Consumer(int cono, String name, int pre, int post, String type) {
        this.cono = cono;
        this.name = name;
        this.pre = pre;
        this.post = post;
        this.type = type;
    }

    public int getCono() {
        return cono;
    }

    public void setCono(int cono) {
        this.cono = cono;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPre() {
        return pre;
    }

    public void setPre(int pre) {
        this.pre = pre;
    }

    public int getPost() {
        return post;
    }

    public void setPost(int post) {
        this.post = post;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void genBill() {

        if (this.post > this.pre) {
            this.unit = this.post - this.pre;

            if (this.type.equalsIgnoreCase("domastic")) {
                this.price = getdomPrice(this.unit);
            } else if (this.type.equalsIgnoreCase("commercial")) {
                this.price = getcomPrice(this.unit);
            }
        }
        else{
            System.out.println("Error!");
        }

    }

    public double getdomPrice(int un) {
        if (un <= 100) {
            return (un * 1);
        } else if (un > 100 && un <= 200) {
            return (un * 2.50);
        } else if (un > 200 && un <= 500) {
            return (un * 4);
        } else {
            return (un * 6);
        }
    }

    public double getcomPrice(int un) {
        if (un <= 100) {
            return (un * 2);
        } else if (un > 100 && un <= 200) {
            return (un * 4.50);
        } else if (un > 200 && un <= 500) {
            return (un * 6);
        } else {
            return (un * 7);
        }
    }

    public void displayBill() {
        System.out.println("Consumer [Customer No=" + cono + ", Customer name=" + name + ", Current Reading=" + post
                + ", Previous Reading=" + pre + ", Electric type=" + type + ", Unit Used=" + this.unit + ", Bill Amount="
                + this.price + "]");
    }
}
