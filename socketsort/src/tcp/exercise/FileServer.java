package tcp.exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket server=new ServerSocket(50000);
		
		Socket s=server.accept();
		
		BufferedReader bufIn=new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintStream printOut=new PrintStream(s.getOutputStream());
		
		File file=new File("E:\\filereceive.txt");
		FileWriter fw=new FileWriter(file);
		BufferedWriter buf=new BufferedWriter(fw);
				
				
				
		String str=null;
		
		
		while((str=bufIn.readLine())!=null){
			buf.write(str); 
			buf.flush();
		}
		printOut.println("received");
		s.close();
		
		server.close();

	}

}
