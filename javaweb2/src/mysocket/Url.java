package mysocket;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Url {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String str="http://caonima.com:5050/";
		 
		URL url=new URL(str);
		
		System.out.println(url.getAuthority());
		System.out.println(url.getHost());
		System.out.println(url.getPort());
		System.out.println(url.getProtocol());
		System.out.println(url.getRef());
		System.out.println(url.getUserInfo());
		
		InputStream input=url.openStream();
		byte b[]=new byte[1024];
		int len=input.read(b);
         String s=new String(b,0,len);
         System.out.println(s);
         input.close();
		

	}

}
