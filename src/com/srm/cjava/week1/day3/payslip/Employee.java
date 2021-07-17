package week1.day3.payslip;

public class Employee {
    String empName;
    int empId;
    String address;
    String mailId;
    int mobileNumber;
    void display(){
        System.out.println("/*------------Employee Details------------*/");
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Id" + empId);
        System.out.println("Employee Mail" + mailId);
        System.out.println("Employee NUmber" + mobileNumber);
    }
}
