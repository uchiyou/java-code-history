package uu.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet h=new HashSet();
		show(h);

	}
	private static void show(HashSet h){
		h.add("caonima");
		h.add("kaokao");
		h.add("caonima");
		h.add("kaokao");
		h.add("why do this to me");
		for(Iterator it=h.iterator();it.hasNext();){
			System.out.println(it.next());
		}
	}

}
