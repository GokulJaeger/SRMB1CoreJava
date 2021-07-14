package day19.rmi;

import java.rmi.*;

public class ClientRMI {
    public static void main(String args[]) {
        try {
            Calc stub = (Calc) Naming.lookup("rmi://localhost:5000/sonoo");
            System.out.println(stub.add(34, 4));
            System.out.println(stub.sub(34, 4));
            System.out.println(stub.mul(34, 4));
        } catch (Exception e) {
        }
    }
}