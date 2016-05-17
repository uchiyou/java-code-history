package other.other;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDivide {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String date1="2014--1--2";
		String date2="2014--4--5";
		divide(date1,date2);

	}
	public static void divide(String date1,String date2) throws ParseException{
		//1    将日期字符串转换为日期格式对象
		//定义日期格式对象
		DateFormat format=DateFormat.getDateTimeInstance();
		format=new SimpleDateFormat("yyyy--MM--dd");
		//字符串转换为日期格式
		Date date_1=format.parse(date1);
		Date date_2=format.parse(date2);
		
		//获得它们的毫秒级
		long lon1=date_1.getTime();
		long lon2=date_2.getTime();
		//两者相减
		System.out.println((lon2-lon1)/1000/3600/24);
		
		
	}

}
