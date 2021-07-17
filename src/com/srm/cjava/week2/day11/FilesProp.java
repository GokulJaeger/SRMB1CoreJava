package week2.day11;

import java.io.Console;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FilesProp {
    public static void main(String[] args) throws FileNotFoundException {
        Console console = System.console();
        String nam = console.readLine("Name: ");
        String email = console.readLine("Email: ");
        String desig = console.readLine("Designation: ");

        Properties ep = new Properties();
        try (FileOutputStream fos = new FileOutputStream("Employee.dat")) {
            ep.setProperty("Name", nam);
            ep.setProperty("Email", email);
            ep.setProperty("Designation", desig);
            ep.store(fos, "EmployeeList");
            fos.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(ep);

        Properties epp = new Properties();

        try (FileInputStream fis = new FileInputStream("Employee.dat")) {
            epp.load(fis);

            fis.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Employee Name: " + epp.getProperty("Name"));
        System.out.println("Employee Email: " + epp.getProperty("Email"));
        System.out.println("Employee Designation: " + epp.getProperty("Designation"));
    }
}
