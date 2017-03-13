
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        switch(args.length) {
        case 1:
        	//Parse the string argument as a signed decimal integer
        	client.Client client = new client.Client(args[0], Integer.parseInt(args[1]));
            
        case 2:
        	server.Server server = new server.Server(Integer.parseInt(args[0]));
	
        }
	}
}
