import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface Interface_ChatRemote extends Remote {
    public void sendMessage(ChatMsg message) throws RemoteException;
    public ArrayList<ChatMsg> getMessages() throws RemoteException;
}
