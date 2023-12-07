
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface rmi_interface extends Remote {
	public double getsquare(double input) throws RemoteException;
	public double getSquare(double input) throws RemoteException;
	double getSquareRoot(double input) throws RemoteException;
}
