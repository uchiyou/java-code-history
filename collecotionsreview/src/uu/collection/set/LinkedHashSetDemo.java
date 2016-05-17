package uu.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet lhs=new LinkedHashSet();
		show(lhs);

	}
	private static void show(LinkedHashSet lhs){
		lhs.add("has order1");
		lhs.add("no order1");
		lhs.add("the only1");
		lhs.add("has order2");
		for(Iterator it=lhs.iterator();it.hasNext();){
			System.out.println(it.next());
		}
	}

}
