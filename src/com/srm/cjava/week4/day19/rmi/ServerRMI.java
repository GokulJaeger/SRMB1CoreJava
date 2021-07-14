package day19.rmi;
import java.rmi.*;

public class ServerRMI {
    public static void main(String args[]) {
        try {
            Calc stub = new CalcRemote();
            Naming.rebind("rmi://localhost:5000/sonoo", stub);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}