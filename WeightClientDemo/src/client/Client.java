package client;
import java.io.*;
import java.net.*;


public class Client {
	private Socket socket = null;
	private DataInputStream terminal = null;
	private DataOutputStream dataStreamOut = null;

	public Client(String host, int port) {
		System.out.println("Try connect to server");
		try {
			socket = new Socket(host, port);
			System.out.println("Connected to server:" + socket.getLocalSocketAddress() + 
					"byport" + socket.getLocalPort());
		establishConnection();
		}
	}
	private void establishConnection(){
		
	}
}


