package other.other;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SingleFormatDate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		System.out.println(date);
		//格式化日期
		//获取格式化日期对象
		DateFormat format=DateFormat.getDateTimeInstance();
		//设置日期格式
		format=new SimpleDateFormat("yyyy---MM---ddd--WW--a--HH");
		//将日期进行包装
		String str=format.format(date);
		System.out.println(str);

	}

}
