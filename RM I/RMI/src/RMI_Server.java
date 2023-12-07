import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class RMI_Server extends UnicastRemoteObject implements rmi_interface {

	public RMI_Server() throws RemoteException{
		super();
	}
	
	@Override
	public double getsquare(double input) throws RemoteException {
		return input * input;
	}

	@Override
	public double getSquareRoot(double input) throws RemoteException {
		return Math.sqrt(input);
	}

	
	public static void main(String[] args) throws RemoteException, AlreadyBoundException{
		 try {
			Registry registry = LocateRegistry.createRegistry(7777);
			registry.bind("hola", new RMI_Server());
			System.out.println("Hola");
		 }catch(Exception e) {
			 System.out.println("Error");
		 }
		 
	}

	@Override
	public double getSquare(double input) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}
}


