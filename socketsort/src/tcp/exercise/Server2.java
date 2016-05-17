package tcp.exercise;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket server=new ServerSocket(30000);
		
		Socket s=server.accept();
		String ip=s.getInetAddress().getHostAddress();
		int port=s.getPort();
		InputStream input=s.getInputStream();
		OutputStream output=s.getOutputStream();
		
		byte[] b=new byte[1024];
		int len=0;
		String str=null;
		
		while(true){
			len=input.read(b);
			str=new String(b,0,len);
			if(str.equals("886"))
				break;
			System.out.println(ip+":"+port+":"+str);
			output.write("receive ".getBytes());
		}
		s.close();
		server.close();

	}

}
