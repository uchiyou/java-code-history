package uu.first;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("E:\\uu.txt");
		char ch[]=new char[3];
		int len=0;
		while((len=fr.read(ch))!=-1){
			//if(ch[0]==' '|ch[1]==' '|ch[2]==' ') continue;
			System.out.print(new String(ch));
		}
		fr.close();

	}

}
