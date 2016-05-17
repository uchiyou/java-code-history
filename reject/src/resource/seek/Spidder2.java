package resource.seek;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Spidder2 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//String webSite="http://211.137.133.5/?wlanacname=0109.0029.290.00&wlanuserip=10.71.28.184&ssid=CMCC-EDU&vlan=3006";
		String webSite="E:\\test.html";
        URL url=new URL(webSite);
        
        File got=new File("E:\\qq.txt");
        PrintStream print=new PrintStream(new FileOutputStream(got),true);
       
        InputStream input=url.openStream();
        BufferedReader bufIn=new BufferedReader(new InputStreamReader(input));
        String str=null;
        
        String regex="([a-zA-Z\\d_]){3,}+@(\\.[a-zA-Z]+)+";
        
        Pattern pattern=Pattern.compile(regex);
        
        while((str=bufIn.readLine())!=null){
        	
        	Matcher matcher=pattern.matcher(str);
        	
        	while(matcher.find()){
        		String s=matcher.group();
        		print.println(s);
        		System.out.println(s);
        		
        	}
        	
        }
        
        

	}

}
