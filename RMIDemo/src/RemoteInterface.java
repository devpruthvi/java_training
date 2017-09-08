import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public interface RemoteInterface extends Remote {
	int add(int a,int b) throws RemoteException;
}
