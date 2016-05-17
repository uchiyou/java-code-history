package uu.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> tr=new TreeSet<String>(new ComparatorDemo());
		show(tr);
		Class clas=tr.getClass();
		System.out.println(clas.toString());

	}
	public static void show(TreeSet<String> tr){
		tr.add("string1");
		tr.add("short");
		tr.add("american");
		tr.add("long1");
		for(Iterator<String> it=tr.iterator();it.hasNext();){
			System.out.println(it.next());
		}
	}

}
