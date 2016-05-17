package html.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class htmlServer {
	public static void main(String args[]) throws IOException{
		ServerSocket server=new ServerSocket(10009);
		System.out.println(server.getInetAddress().getHostAddress());
		Socket client=server.accept();
		System.out.println(client.getInetAddress().getHostAddress());
		InputStream input=client.getInputStream();
		byte by[]=new byte[2048];
		int len=input.read(by);
		System.out.println(new String(by));
		 PrintStream print=new PrintStream(client.getOutputStream(),true);
		 print.println("<font color='#ff00ff' size=7>register succcess</font>");
		client.close();
		server.close();	
	}

}
