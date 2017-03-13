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
			/* internal buffer is refilled as necessary from the contained input stream
			Create a BufferedInputStream and saves its argument, the input stream in, for later use */
			dataStreamOpen();
			boolean messageRecieve = false;
			while (!messageRecieve) {
				try {
					String message = dataStreamIn.readUTF();
					System.out.println("Received: " + message);
					messageRecieve = message.equals("exit") || message.equals("q") || message.equals("quit");
				} catch (IOException e) {
					messageRecieve = true;
				}
			}
			dataStreamClose();


		}
		//I/O exception of some sort has occurred.
		catch (IOException e) {
			e.printStackTrace();
		}

	}
	private void dataStreamOpen() throws IOException {
		if (socket == null)
			return;
		dataStreamIn = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
	}
	private void dataStreamClose() throws IOException {
		if (socket != null)   socket.close();
		if (dataStreamIn != null) dataStreamIn.close();
	}


}
