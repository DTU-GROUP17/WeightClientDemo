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
            
            }
    
    	}
    

}
