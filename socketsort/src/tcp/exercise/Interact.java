package tcp.exercise;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Interact {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket server=new ServerSocket(8000);
		
		Socket s=server.accept();
		
		System.out.println(s.getInetAddress().getHostName());
		
		InputStream input=s.getInputStream();
		OutputStream out=s.getOutputStream();
		
		byte[] b=new byte[1024*8];
		int len=-1;
		
		len=input.read(b);
		System.out.println(new String(b,0,len));
		
		out.write("<font color='blue' size='8'>ok,received,</font>".getBytes());
		
		s.close();
		server.close();
		

	}

}
