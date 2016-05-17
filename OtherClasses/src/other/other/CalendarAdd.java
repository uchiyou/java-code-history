package other.other;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarAdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar=Calendar.getInstance();
		calendar.set(2014,6,23);
		//calendar.add(Calendar.YEAR,2);
		calendar.add(Calendar.DAY_OF_MONTH,34);
		Date date=calendar.getTime();
		//将日期进行包装
		//获取格式化日期对象
		DateFormat dateformat=DateFormat.getTimeInstance();
		//设置日期格式化
		dateformat=new SimpleDateFormat("yyyy--MM--dd");
		//将日期进行包装
		String str=dateformat.format(date);
		System.out.println(str);

	}

}
