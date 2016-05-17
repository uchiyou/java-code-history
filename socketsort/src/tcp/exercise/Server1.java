package tcp.exercise;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket server=new ServerSocket(20001);
		
		Socket s=server.accept();
		System.out.println(s.getInetAddress().getHostAddress());
		
		InputStream input=s.getInputStream();
		 
		byte[] b=new byte[1024];
		 
		int len=input.read(b);
		System.out.println(b.length);
		String str=new String(b,0,len);
		System.out.println(str);
		
		System.out.println(new String(b));
		
		s.close();
		server.close();

	}

}
