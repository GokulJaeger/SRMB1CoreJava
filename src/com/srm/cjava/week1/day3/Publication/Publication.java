package week1.day3.Publication;

class Publication {
    protected String title;
    protected float bookprice;

    void getdatap(String tit, float bp) {
        this.title = tit;
        this.bookprice = bp;
    }

    void displayp() {
        System.out.println("Publication title: " + this.title);
        System.out.println("Publication price: " + this.bookprice);
    }
}

class Book extends Publication {
    protected int pagecount;

    void getdata(int pc) {
        this.pagecount = pc;
    }

    void display() {
        System.out.println("Book page count: " + this.pagecount);
    }
}

class Cd extends Publication {
    protected float playtime;

    void getdata(float pt) {
        this.playtime = pt;
    }

    void display() {
        System.out.println("CD Tape's playing time: " + this.playtime);
    }
}
