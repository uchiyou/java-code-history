package uu.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerFirst {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("server star now");
		ServerSocket server=new ServerSocket(33330);
		Socket client=server.accept();
		String ip=client.getInetAddress().getHostAddress();
		//getInetAddress() the method return InetAddress ,so use the method getHostAddress()(the
		//method return the String type of IP
		InputStream input=client.getInputStream();
		OutputStream output=client.getOutputStream();
		byte ch[]=new byte[1024];
		int len=0;
		len=input.read(ch);
		System.out.println(ip+new String(ch));
		output.write("server received".getBytes());
		client.close();
		server.close();

	}

}
