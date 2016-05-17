package tcp.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class FileClient {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket client=new Socket("127.0.0.1",50000);
		
		PrintStream printOut=new PrintStream(client.getOutputStream(),true);
		BufferedReader bufIn=new BufferedReader(new InputStreamReader(client.getInputStream()));
		
		BufferedReader buf=new BufferedReader(new FileReader("E:\\123.txt"));
		
		String line=null;
		
		while((line=buf.readLine())!=null){
			printOut.println(line);
		}
		client.shutdownOutput();
		line=bufIn.readLine();
		System.out.println(line);
		buf.close();
		client.close();
		
		
		

	}

}
