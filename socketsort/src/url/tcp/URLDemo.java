package url.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String str="http://zhidao.baidu.com/link?url=BBvWWlCwnDYwxiiF_GQKs-95LcU7HEBXwVvTIyCLn-YvlZBVba2flBYqRbEjauuHgIPdGeeDOXs4aTREvk6Aaa";
		URL u=new URL(str);
		/*
		System.out.println("get protocol "+u.getProtocol());
		System.out.println("host "+u.getHost());
		System.out.println("path "+u.getPath());
		System.out.println("port "+u.getPort());
		System.out.println("file "+u.getFile());
		System.out.println("query "+u.getQuery());
		*/
		
		/*
		BufferedReader bufIn=new BufferedReader(new InputStreamReader(u.openStream()));
		String info=null;
		while((info=bufIn.readLine())!=null){
			System.out.println(info);
			
		}
		bufIn.close();
		*/
		
		URLConnection uc=u.openConnection();
		System.out.println(uc);
		String h=uc.getHeaderField("Content-Type");
		System.out.println(h);

	}

}
