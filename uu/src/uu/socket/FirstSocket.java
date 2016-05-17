package uu.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.InputStream;

public class FirstSocket {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket socket=new Socket("0.0.0.0",33330);
		OutputStream out=socket.getOutputStream();
		InputStream input=socket.getInputStream();
		/*
		 * InputStream and OutputStream are abstract class,
		 * 此处将子类塑型（强制转换）为父类
		 * 
		 */
		out.write("hellow this is first socket".getBytes());
		byte by[]=new byte[1024];
		input.read(by);
		System.out.println(new String(by));
		socket.close();

	}

}
