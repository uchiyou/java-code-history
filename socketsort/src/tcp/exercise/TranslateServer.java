package tcp.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TranslateServer {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket server=new ServerSocket(40009);
		
		Socket s=server.accept();
		int port = s.getPort();
		System.out.println(port);
		
		BufferedReader bufIn=new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintStream printOut=new PrintStream(s.getOutputStream(),true);
		
		String str=null;
		String ip=s.getInetAddress().getHostAddress();
		System.out.println(str);
		
		while((str=bufIn.readLine())!=null)
		{
			System.out.println("is a test ");
			System.out.println(str);
			str=str.toUpperCase();
			printOut.println(str);
		}
		s.close();
		server.close();
		

	}

}
