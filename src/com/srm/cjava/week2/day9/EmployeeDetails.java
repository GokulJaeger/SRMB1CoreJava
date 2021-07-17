package week2.day9;

import java.util.LinkedList;

public class EmployeeDetails {
    public static void main(String[] args) {
        
        LinkedList<Employee> emp = new LinkedList<>();

        emp.add(new Employee(2928, "Gokul", "Driver"));
        emp.add(new Employee(2929, "Lokesh", "Developer"));
        emp.add(new Employee(2939, "Priya", "Programmer"));
        emp.add(new Employee(2935, "Latha", "Analyst"));
        emp.add(new Employee(2936, "Sumo", "Manager"));
        emp.add(new Employee(2932, "Kishore", "CEO"));
        

        for (Employee ed : emp) {
            System.out.println(ed.toString());
        }
    }
}
