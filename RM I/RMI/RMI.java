import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class RMI_Cliente {
	private static Scanner scan = null;
	
	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		try {
			rmi_interface api = (rmi_interface) Naming.lookup("rmi://localhost:7777/hola");
			
			scan = new Scanner(System.in);
			for(;;) {
				System.out.println("************************");
				System.out.println("Favor de ingresar sus datos");
				System.out.println("************************");
				System.out.println("Nombre");
				System.out.println("Apellidos");
				System.out.println("Edad");
				System.out.println("Ciudad");
				
				int choice = getChoice();
				if(choice ==1) {
					System.out.println(api.getSquare(getInput()));
				}
				else {
					System.out.println(api.getSquareRoot(getInput()));
				}

			}
		}catch(Exception e) {
			System.out.println("Error");
			e.printStackTrace();
	}
		
	}
	public static int getChoice() {
		try {
			System.out.println("  ");
			int input = scan.nextInt();
			if(input <1) throw new Exception();
			return input;
		}catch (Exception e) {
			System.err.println("Error");
			return getChoice();
		}
	}
	public static double getInput() {
		try {
			System.out.println("  ");
			double input = scan.nextDouble();
			return input ;
		}catch(Exception e) {
			System.err.println("Error");
			return getInput();
		}
		
		
	}
}
