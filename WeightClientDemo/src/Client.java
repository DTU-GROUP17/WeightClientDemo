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
	
	private ServerSocket serSocket;
	private ServiceClientHandler client;
	private static int portNumber = 8000;
	private Scanner scan;
	private boolean runCheck = true;
	
	
}
