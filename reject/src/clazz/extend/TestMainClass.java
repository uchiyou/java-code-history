package clazz.extend;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestMainClass {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		
		File file=new File("E:\\school.properties");
		FileInputStream fi=new FileInputStream(file);
		
		Properties p=new Properties();
		p.load(fi);
		
		for(int i=0;i<p.size();i++){
			String student=p.getProperty("School"+(i+1));
			Class s=Class.forName(student);
			
			School sch=(School)s.newInstance();
			sch.learn();
			sch.live();
			
			
		}

	}

}
