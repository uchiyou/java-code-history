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
		//��ʽ������
		//��ȡ��ʽ�����ڶ���
		DateFormat format=DateFormat.getDateTimeInstance();
		//�������ڸ�ʽ
		format=new SimpleDateFormat("yyyy---MM---ddd--WW--a--HH");
		//�����ڽ��а�װ
		String str=format.format(date);
		System.out.println(str);

	}

}
