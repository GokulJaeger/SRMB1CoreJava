package Assessment;

public class EmpDetails {
    public static void main(String[] args) {
        Employee emp = new Employee(234, "Gokul", 5200.250);
        System.out.println("\n<<<<<<<<<<getting details.......>>>>>>>>>>");
        emp.display();
        System.out.println("\n<<<<<<<<<<setting percentage increase in salary.......>>>>>>>>>>");
        emp.salary(10);
        emp.display();
    }
}
