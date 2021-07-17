package week1.day3.Publication;



class Pub {
    public static void main(String[] args) {
        Cd c1 = new Cd();
        c1.getdatap("BBC",2154.21f);
        c1.getdata(62.15f);
        c1.displayp();
        c1.display();

        Book b1 = new Book();
        b1.getdata(154);
        b1.getdatap("Sweet Laddu's", 4587.5f);
        b1.display();
        b1.displayp();
    }
}
