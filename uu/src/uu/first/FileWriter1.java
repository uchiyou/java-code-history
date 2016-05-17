package uu.first;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		final String LINK_SEPARATOR=System.getProperty("line.separator");
		FileWriter fw=new FileWriter("E:\\uu.txt",true);
		fw.write(LINK_SEPARATOR+"hellow java");
		fw.close();

	}

}
