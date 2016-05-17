package tcp.exercise;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class PictureServer {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket server=new ServerSocket(6000);
		
		Socket s=server.accept();
		
		BufferedInputStream bufIn=new BufferedInputStream(s.getInputStream());
		PrintStream printOut=new PrintStream(s.getOutputStream());
		
		File file=new File("E:\\eye.jpg");
		BufferedOutputStream buf=new BufferedOutputStream(new FileOutputStream(file));
		
		byte[] b=new byte[1024];
		int  len=-1;
		
		while((len=bufIn.read(b))!=-1){
			buf.write(b,0,len);
			buf.flush();
		}
		
		printOut.println("received");
		
		
		buf.close();
		s.close();
		server.close();
		
		

	}

}
