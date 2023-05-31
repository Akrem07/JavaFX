import java.util.Date;

public class ChatMsg implements java.io.Serializable {
    String message;
    String sender;
    Date messageDate;

    public ChatMsg(String message, String sender) {
        this.message = message;
        this.sender = sender;
        this.messageDate = new Date();
    }

}
