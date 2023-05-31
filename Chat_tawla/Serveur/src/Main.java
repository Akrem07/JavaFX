import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Main {
    public static void main(String[] args) {
        System.out.println("le serveur est connecté");

        //making the server object
        try {
            LocateRegistry.createRegistry(5000);
            Naming.rebind("rmi://127.0.0.1:5000/chat",new ChatImplementation());
        } catch (RemoteException | MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

}