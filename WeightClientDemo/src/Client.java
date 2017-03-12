import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

/*
 Client class is responsible for server socket

 */
public class Client {

	private ServerSocket serverSocket;
	private static int portNumber = 8000;
	//private  client;
	private Scanner scan;
	private boolean runCheck = true;

/*This method implements server sockets*/
	public Client(String port){

		portNumber = Integer.parseInt(port);

		try {
			serverSocket = new ServerSocket(portNumber);
			scan = new Scanner(System.in);
		} catch (IOException e) {
			System.out.println("Error 12: Server could not start. Exit");
			System.exit(0);

		}

	}
}




