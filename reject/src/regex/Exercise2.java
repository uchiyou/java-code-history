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
		
		
		
		
			//按从小到大的顺序输出
			
			//用treeSet集合可以自动的根据字符串的hashCode() 和 equals()进行自动排序
			//由于是字符串，所以将每一段都弄成３位，在前添加０
			str=str.replaceAll("(\\d+)","00$1");//将每一段连续数字用前面加两个０和其自身来替代
		//	System.out.println(str);
			
			str=str.replaceAll("0*(\\d{3})","$1");//前边为一个或多个０，用后边的三个数字替代掉
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
				s=s.replaceAll("0+(\\d)", "$1");//(0* has or no 0  ....0+ one or more 0 ) 用括号将数字封装成组，
				System.out.println(s);
			}
			
		

	}

}
