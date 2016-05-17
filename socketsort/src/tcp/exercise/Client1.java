package tcp.exercise;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client1 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket client=new Socket("www.hao123.com",8080);
		
		InetAddress ip=client.getInetAddress();
		String IP=ip.getHostAddress();
		System.out.println(IP);
		
		
		OutputStream out=client.getOutputStream();
		
		out.write("just a test ".getBytes());
		
		out.close();

	}

}
