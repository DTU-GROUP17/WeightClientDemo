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
			//Return the address of the endpoint this socket is bound to.
			System.out.println("Connected to server:" + socket.getLocalSocketAddress() + 
					"byport" + socket.getLocalPort());//implementing clients socket.
		establishConnection();
		//Thrown to indicate that the IP address of a host could not be determined.
		} catch (UnknownHostException e){
			System.out.println("Unknow host"+ e.getMessage());
		//access to the stack trace.
		} catch (IOException e){
			e.getStackTrace();
		}
		/*produce concatenated messages in natural language and flush the data from data 
		output stram*/
		String message = "";
        while(!exit(message)) {
            try {
                message = terminal.readLine();
                dataStreamOut.writeUTF(message);
                dataStreamOut.flush();
            } catch (IOException e) {
                e.getStackTrace();
            }
        }
        terminateConnection();
	}
	private void establishConnection(){
		
	}
	private void terminateConnection(){
		
	}
	private boolean exit(){
		
	}
	
	
	
}


