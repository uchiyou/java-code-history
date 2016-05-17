package tcp.exercise;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class PictureSend {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket client=new Socket("127.0.0.1",7000);
		
		BufferedReader bufIn=new BufferedReader(new InputStreamReader(client.getInputStream()));
		BufferedOutputStream bufOut=new BufferedOutputStream(client.getOutputStream());
		
		int count=1;
	//	for(int i=1;i<9;i++){
		FileInputStream fi=new FileInputStream("E:\\4.jpg");
		BufferedInputStream buf=new BufferedInputStream(fi);
		
		byte[] b=new byte[1024];
		int len=-1;
		
		while((len=buf.read(b))!=-1){
			bufOut.write(b,0,len);
			bufOut.flush();
		}
		
		client.shutdownOutput();
		
		
		String str=bufIn.readLine();
		System.out.println("receive "+str);
		
		
		buf.close();
	//	}
		client.close();
		

	}

}
