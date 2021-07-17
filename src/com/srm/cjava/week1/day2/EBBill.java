package week1.day2;

public class EBBill {
    public static void main(String[] args) {
        Consumer c1 = new Consumer(1093, "Laddu", 950, 1254, "domastic");
        c1.genBill();
        c1.displayBill();

        Consumer c2 = new Consumer(4521, "Jangiri", 950, 1254, "domestic");
        c2.genBill();
        c2.displayBill();
    }
}
