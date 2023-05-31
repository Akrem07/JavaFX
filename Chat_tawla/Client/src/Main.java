import java.rmi.Naming;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello je suis le client");
        Interface_ChatRemote chat;
        try {
            chat = (Interface_ChatRemote) Naming.lookup("rmi://localhost:5000/chat");
            //nasna3 msg
            ChatMsg message = new ChatMsg("hi je suis le 2eme ", "client 2");
            //nab3eth msg ll serveur
            chat.sendMessage(message);

            //obtenir mdg
            ArrayList<ChatMsg> listMessages = chat.getMessages();
            System.out.println("Liste des messages: ");
            for (ChatMsg chatMsg : listMessages) {
                System.out.println("["+ chatMsg.sender+"] : "+ chatMsg.message);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

