package sample;

import javafx.scene.layout.VBox;

import java.io.*;
import java.net.Socket;

public class Client {


    private Socket socket;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    public Client(Socket socket){
        ;
        try {
            //accept hiya blocking methode traja3 socket object li nstaamlouha ll communication m3a l client
            this.socket=socket;
            //java 3andha 2 types m streams wa7da caracter stream w 2 bit stream
            this.bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.bufferedWriter=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        } catch (IOException e) {
            System.out.println("Error Creating Client");
            e.printStackTrace();
            closeEverything(socket,bufferedWriter,bufferedReader);
        }
    }

    public void sendMessageToServer(String messageToClient){
        try {
            bufferedWriter.write(messageToClient);
            // this is the end of the message kif TLC
            bufferedWriter.newLine();
            bufferedWriter.flush();

        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Error sending message to the Server!");
            closeEverything (socket, bufferedWriter, bufferedReader);
        }

    }

    public void receiveMessageFromServer(VBox vBox){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (socket.isConnected()){
                    try {
                        String messageFromServer = bufferedReader.readLine();
                        //sta3melna vbox 5ater 3ana addlabel fl controller static methode wl vbox mehouch static variable
                        Controller.addLabel(messageFromServer,vBox);
                    }catch (IOException e){
                        e.printStackTrace();
                        System.out.println("Error receiving message from Server!");
                        closeEverything (socket, bufferedWriter, bufferedReader);
                        //ken ma famech erreur bech yab9a dima ye5dem
                        break;


                    }
                }
            }
        }).start();
    }


    public void closeEverything(Socket socket, BufferedWriter bufferedWriter, BufferedReader bufferedReader){
        try {
            if (this.bufferedReader !=null){
                this.bufferedReader.close();
            }
            if (this.bufferedWriter != null){
                this.bufferedWriter.close();
            }
            if (this.socket != null){
                this.socket.close();
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }




}
