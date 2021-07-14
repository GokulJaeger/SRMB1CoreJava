package day19.rmi;

import java.rmi.*;
import java.rmi.server.*;

public class CalcRemote extends UnicastRemoteObject implements Calc {
    CalcRemote() throws RemoteException {
        super();
    }

    public String add(int x, int y) {
        return "Add: " + (x + y);
    }

    public String sub(int x, int y) {
        return "Sub: " + (x - y);
    }

    public String mul(int x, int y) {
        return "Mul: " + (x * y);
    }
}