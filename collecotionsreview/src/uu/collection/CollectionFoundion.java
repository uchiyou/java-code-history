package uu.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionFoundion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection coll = new ArrayList();
		show(coll);
	}

	public static void show(Collection coll) {
		coll.add("hellow");
		coll.add("xiaoqiang");
		coll.add("where will you go");
		System.out.println(coll + "....size.." + coll.size());
		coll.remove("hellow");
		System.out.println(coll + "....size.." + coll.size());
		System.out.println(coll.contains("xiaoqiang"));
		coll.clear();
		
		
	}

}
