package week1.day3;

class Person {
    String name;
    int age;
    int phonenumber;
    String address;
    int salary;

    public void printsalary() {
        System.out.println("SALARY" + salary);
    }
}

class Employee extends Person {
    String specialization;
}

class Manager extends Person {
    String department;
}

public class SalaryCal {
    public static void main(String[] args) {
        Employee obj1 = new Employee();
        obj1.name = "Gokul";
        obj1.age = 23;
        obj1.phonenumber = 887645676;
        obj1.address = "Chennai";
        obj1.salary = 25000;
        obj1.specialization = "Java";
        obj1.printsalary();

        Manager obj2 = new Manager();
        obj2.name = "Sweatha";
        obj2.age = 53;
        obj2.phonenumber = 867645676;
        obj2.address = "Hydrabad";
        obj2.salary = 58000;
        obj2.department = "Project Lead";

        obj2.printsalary();
    }
}