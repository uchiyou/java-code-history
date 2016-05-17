package system.class1;

import java.util.Properties;
import java.util.Set;

public class SystemDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time=System.currentTimeMillis();
		System.out.println(time/1000/60/60/24/365);
		System.gc();
		Properties p=System.getProperties();
		Set<String> keySet=p.stringPropertyNames();
		for(String str : keySet){
			String value=p.getProperty(str);
			System.out.println(str+"...."+value);
		}
		

	}

}
