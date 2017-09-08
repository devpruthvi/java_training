import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements RemoteInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected Server() throws RemoteException {
		super();
	}
	
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		try {
			//Registry reg =  LocateRegistry.getRegistry();
			//System.setProperty("java.rmi.server.hostname","192.168.105.209");
			Naming.rebind("TEJAS", new Server());
			System.out.println("Server is Up and Ready!");
		}
		catch (Exception e) {
			System.err.println("Couldn't create server :/");
			e.printStackTrace();
		}
	}

}
