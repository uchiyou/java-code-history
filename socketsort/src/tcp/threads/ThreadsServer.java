package tcp.threads;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ThreadsServer {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket server=new ServerSocket(7000);
		
		while(true){
			Socket s=server.accept();
			new Thread(new Clients(s)).start();
		}
		

	}

}
