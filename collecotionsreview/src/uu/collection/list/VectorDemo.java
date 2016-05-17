package uu.collection.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		shows(v);

	}
	private static void shows(Vector v){
		v.addElement("hellow");
		v.addElement("java");
		v.addElement("insist");
		
//		for(Iterator it=v.iterator();it.hasNext();)
//			System.out.println(it.next());
		Enumeration en=v.elements();
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());
		}
	}

}
