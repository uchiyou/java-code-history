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
		//�����ڽ��а�װ
		//��ȡ��ʽ�����ڶ���
		DateFormat dateformat=DateFormat.getTimeInstance();
		//�������ڸ�ʽ��
		dateformat=new SimpleDateFormat("yyyy--MM--dd");
		//�����ڽ��а�װ
		String str=dateformat.format(date);
		System.out.println(str);

	}

}
