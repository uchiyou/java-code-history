package tcp.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Client2 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Socket client=new Socket("127.0.0.1",30000);
		
		OutputStream out=client.getOutputStream();
		InputStream input=client.getInputStream();
		
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		String str=null;
		 
		while((str=buf.readLine())!=null)
		{
			out.write(str.getBytes());
			if(str.equals("886"))
				break;
			byte[] b=new byte[1024];
			int len=input.read(b);
			str=new String(b,0,len);
			System.out.println("give back "+str);
			
		}
		client.close();

	}

}
