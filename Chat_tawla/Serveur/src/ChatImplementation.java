import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class ChatImplementation extends UnicastRemoteObject implements Interface_ChatRemote {
    ArrayList<ChatMsg> listMessages = new ArrayList<ChatMsg>();

    public ChatImplementation() throws RemoteException {
        super();
    }

    @Override
    public void sendMessage(ChatMsg message) throws RemoteException {
        this.listMessages.add(message);
    }

    @Override
    public ArrayList<ChatMsg> getMessages() throws RemoteException {
        return this.listMessages;
    }
}
