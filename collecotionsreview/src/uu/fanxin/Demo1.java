package uu.fanxin;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo1 {

	/**
	 * @param args
	 *
	 */
	public static void main(String args){
	LinkedList<String> link=new LinkedList<String>();
	show(link);
	//Class class=link.getClass();
	
		
	}
	
	public static void show(LinkedList<String> link){
		link.add("no order1");
		link.add("no order2");
		link.add("no order1");
		link.add("no order2");
		link.addFirst("at first?");
		link.addLast("at last");
		String str=null;
		for(Iterator<String> it=link.iterator();it.hasNext();)
			str=it.next();
			System.out.println(str);
	}

}
