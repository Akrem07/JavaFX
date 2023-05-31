import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Socket s=new Socket("127.0.0.1",9001);
            System.out.println("je suis Client je suis connecté");
            Scanner sc=new Scanner(System.in);
            //buffer reader memoire tompon : lire ligne par ligne
            BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
            String line=br.readLine();
            System.out.println(line);
            String id=sc.nextLine();
            //Ouvrir socket en mode ecriture
            PrintWriter pw=new PrintWriter(s.getOutputStream());
            //ecrire dans socket
            pw.println("envoyer Id");
            //envoyer
            pw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}