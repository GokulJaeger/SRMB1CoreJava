import java.rmi.*;

public interface Calc extends Remote {
    public String add(int x, int y) throws RemoteException;

    public String sub(int x, int y) throws RemoteException;

    public String mul(int x, int y) throws RemoteException;
}