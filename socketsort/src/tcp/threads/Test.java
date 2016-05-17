package tcp.threads;

import java.util.Date;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long l=System.currentTimeMillis();
		System.out.println(l);//1406536837153      
		                      //1406536864377
		Date d=new Date();
		System.out.println(d);
		int minute=d.getMinutes();
		int second=d.getSeconds();
		System.out.println(minute+"..."+second);
		

	}

}
