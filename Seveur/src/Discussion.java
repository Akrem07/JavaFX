import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;

public class Discussion extends Thread {
    Socket s;
    public Discussion(Socket s){
        this.s=s;
    }
    public void run(){
        try {
            //Ouvrir socket en mode ecriture
            PrintWriter pw=new PrintWriter(s.getOutputStream());
            //ecrire dans socket
            pw.println("envoyer Id");
            //envoyer
            pw.flush();
            //buffer reader memoire tompon : lire ligne par ligne
            BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
            String line=br.readLine();
            System.out.println(line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
