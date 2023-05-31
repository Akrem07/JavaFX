import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        try {
            int nbClient=0;
            ServerSocket server = new ServerSocket( 9001);
            System.out.println("En ecoute sur port 9001");

            while (nbClient<3){
                Socket s=server.accept();
                System.out.println("Client"+nbClient+"est connecté");
                nbClient++;

                Discussion discussion=new Discussion(s);
                discussion.start();

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}