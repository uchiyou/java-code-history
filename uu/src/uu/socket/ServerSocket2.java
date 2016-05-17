package uu.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocket2 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket server=new ServerSocket(10001);
		Socket client=server.accept();
		String ip=client.getInetAddress().getHostAddress();
		InputStream input=client.getInputStream();
		OutputStream output=client.getOutputStream();
		int len=0;
		byte by[]=new byte[1024];
		String str=null;
		while((len=input.read(by))!=-1){
			str=new String(by,0,len);
			System.out.println(ip+"   "+str);
			output.write("server received".getBytes());
			
		}
		client.close();
		server.close();

	}

}
