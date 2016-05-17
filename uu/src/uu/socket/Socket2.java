package uu.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Socket2 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket socket=new Socket("0.0.0.0",10001);
		InputStream input=socket.getInputStream();
		OutputStream output=socket.getOutputStream();
		//receive information from the keyboard
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		int len=0;
		byte by[]=new byte[1024];
		String str=new String("i come");
		output.write(str.getBytes());
		while((len=input.read(by))!=-1){
			//str=new String(by);
			
			System.out.println("server  "+new String(by)+"\\n"+str);
			str=buf.readLine();
			output.write(str.getBytes());
			if(str.equalsIgnoreCase("886")) break;
		}
		socket.close();

	}

}
