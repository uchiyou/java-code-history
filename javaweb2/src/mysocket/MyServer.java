package mysocket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket server=new ServerSocket(5050);
		
		Socket client=server.accept();
		
		System.out.println(client.getInetAddress().getHostAddress()+"...."+client.getInetAddress().getHostName());
		
		InputStream input=client.getInputStream();
		
		byte b[]=new byte[1024];
		int len=input.read(b);
		String str=new String(b,0,len);
		System.out.println(str);
		
		PrintWriter print=new PrintWriter(client.getOutputStream(),true);
		
		print.println("<font color='red' size='7'/> hellow");
		client.close();
		server.close();
		
	}

}
