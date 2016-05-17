package other.other;

import java.text.DateFormat;
import java.util.Date;



public class DateDemo {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time=System.currentTimeMillis();
		//System.out.println(time);
		Date date=new Date(time);
		System.out.println(date);
		//get specific calendar format ,they have default day style,  FULL and LONG 
		// SHORT  so on can set up the style
		
		//DateFormat format=DateFormat.getDateInstance(DateFormat.LONG);
		//DateFormat format=DateFormat.getDateInstance(DateFormat.FULL);
		
		//DateFormat format=DateFormat.getDateTimeInstance();
		DateFormat format=DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
		
		
		String for_da=format.format(date);
		System.out.println(for_da);
		
	//	System.out.println(date.getTime());
	//	System.out.println(date.getDay());

	}

}
