package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="the day after tomorrow , i will go home ";
		String regex="\\b[a-z]{4}\\b";//\\b mean the board of word
		
//		System.out.println("just a test");
		//�����������������������������������װ�ɶ���
		Pattern pattern=Pattern.compile(regex);
		//����������������������������ͨ�������ȡƥ��������
		Matcher matcher=pattern.matcher(str);
		
	//	System.out.println("another");
		
		while(matcher.find()){
			System.out.println(matcher.group());
			System.out.println(matcher.start()+"::"+matcher.end());
		}
//		System.out.println("over");

	};

}
