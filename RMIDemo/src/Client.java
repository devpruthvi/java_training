import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
	
	public static RemoteInterface lookUp;
	
	public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
		lookUp = (RemoteInterface) Naming.lookup("TEJAS");
		int result = lookUp.add(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		System.out.println("Client sent: " + args[0] + ", " + args[1]);
		System.out.println("Server Responded with: " + result);
	}
}
