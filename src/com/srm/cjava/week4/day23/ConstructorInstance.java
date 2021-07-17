package day23;

public class ConstructorInstance {
    public static void main(String[] args) {
        
        Car c1 = new Car(45, "Hyundai", "Verna");
        Car c2 = new Car();
        c2.setId(58);
        c2.setCname("Skoda");
        c2.setCmodel("Rapid");


        System.out.println("Instance C1: " + c1);
        System.out.println("\nConstructor C2: " + c2);
    }
}
