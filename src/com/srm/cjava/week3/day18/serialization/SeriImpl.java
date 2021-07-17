package week3.day18.serialization;

import java.io.*;

public class SeriImpl {

    public static void main(String[] args) {

        try {

            Employee emp = new Employee(1, "Eren Jaeger", 23, "Founder Titan", 548897.2556);
            FileOutputStream fos = new FileOutputStream("Seridata.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(emp);
            oos.flush();
            oos.close();
            fos.close();
            System.out.println("Employee details Serialized.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}