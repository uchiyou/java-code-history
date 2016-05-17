package uu.first;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filecopy {

	/**
	 * @param args
	 * @throws IOException 
	 * 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("E:\\uu.txt");
		FileWriter fw=new FileWriter("E:\\uu1.txt",true);
		char ch[]=new char[4];
		int len=0;
		while((len=fr.read(ch))!=-1){
			System.out.print(new String(ch));
			fw.write(ch,0,len);
			
		}
		fr.close();
		fw.close();

	}

}
