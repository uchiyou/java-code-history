package regex;

import java.util.Iterator;
import java.util.TreeSet;

public class Exercise2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="127.0.0.1     198.126.4.1      2.4.6.3    2.34.55.1";
		/*
		String [] s=str.split(" +");
		for(String st : s){
			System.out.println(st);
			*/
		
		
		
		
			//����С�����˳�����
			
			//��treeSet���Ͽ����Զ��ĸ����ַ�����hashCode() �� equals()�����Զ�����
			//�������ַ��������Խ�ÿһ�ζ�Ū�ɣ�λ����ǰ��ӣ�
			str=str.replaceAll("(\\d+)","00$1");//��ÿһ������������ǰ����������������������
		//	System.out.println(str);
			
			str=str.replaceAll("0*(\\d{3})","$1");//ǰ��Ϊһ�����������ú�ߵ��������������
	//		System.out.println(str);
			
			TreeSet<String> treeSet=new TreeSet<String>();
			String [] ip=str.split(" +");
			for(String s: ip){
	//			System.out.println(s);
				treeSet.add(s);
			}
			
			Iterator<String> it=treeSet.iterator();
			while(it.hasNext()){
				String s=it.next();
				s=s.replaceAll("0+(\\d)", "$1");//(0* has or no 0  ....0+ one or more 0 ) �����Ž����ַ�װ���飬
				System.out.println(s);
			}
			
		

	}

}
