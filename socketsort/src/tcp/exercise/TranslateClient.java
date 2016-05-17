package tcp.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TranslateClient {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket client=new Socket("127.0.0.1",40009);
		
		PrintStream printOut=new PrintStream(client.getOutputStream(),true);
		BufferedReader bufIn=new BufferedReader(new InputStreamReader(client.getInputStream()));
		
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		
		String str=null;
		
		while((str=buf.readLine())!=null){
			printOut.print(str);
			if(str.equals("886"))
				break;
			str=bufIn.readLine();
			System.out.println("receive  "+str);
		}
		client.shutdownInput();
		client.close();
		

	}

}
