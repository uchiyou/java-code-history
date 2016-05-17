package resource.seek;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Spidder {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("E:\\test.html");
		
		BufferedReader buf=new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		String str=null;
		
	//	String regex="(\\d){8,10}@qq(\\.[a-z]+){1,}";
		String regex="(.)+@(.)+(\\.[a-z]+){1,}";
		
		Pattern pattern=Pattern.compile(regex);
		
//		Matcher matcher=pattern.matcher(str);
		
		while((str=buf.readLine())!=null)
		{
			Matcher matcher=pattern.matcher(str);
			while(matcher.find())
			System.out.println(matcher.group());
		}
		buf.close();

	}

}
