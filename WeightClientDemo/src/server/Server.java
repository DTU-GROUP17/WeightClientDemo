package server;

import java.io.*;
import java.net.*;
//This class implement server socket.
public class Server {
	
	//data input stream defined.
    private Socket socket = null;
    private ServerSocket serverS = null;
    private DataInputStream dataStreamIn = null;
    
    //return the local address of server socket and return the port number.
    public Server(int port){
    	try {
            System.out.println("Opening port:" + port );
            serverS = new ServerSocket(port);
            System.out.println("Server started on" + serverS.getInetAddress() + "on port" + 
            serverS.getLocalPort());
            System.out.println("wait for a client");
            socket = serverS.accept();
            //internal buffer is refilled as necessary from the contained input stream
            dataStream();
            boolean messageRecieve = false;
            while (!messageRecieve) {
                try {
                    String msg = dataStreamIn.readUTF();
                    System.out.println("Received: " + msg);
                    messageRecieve = message.equals("exit") || message.equals("q") || message.equals("quit");
                } catch (IOException e) {
                    messageRecieve = true;
                }
            }
            
            }
    
    	}
    

}
