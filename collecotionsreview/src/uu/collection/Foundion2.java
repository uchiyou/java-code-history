package uu.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Foundion2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection col1=new ArrayList();
		Collection col2=new ArrayList();
		show(col1,col2);

	}
	public static void show(Collection c1,Collection c2){
	c1.add("hellow ");
	c1.add("xioaqiang ");
	c1.add("caonima ");
	
	c2.add("hellow ");
	c2.add("xiaoqiang ");
	c2.add("how are you ");
	for(Iterator it=c1.iterator();it.hasNext();){
		System.out.println(it.next());
	}
	/*System.out.println(c1+"\n"+c2);
	boolean b=c1.containsAll(c2);
	System.out.println(c1+"judge containsAll()  "+b);
	//c2.clear();
	//c2.add("kao");
	boolean b2=c1.addAll(c2);
	System.out.println(c1+" judge addAll()  "+b2);
	*/
	boolean b=c1.removeAll(c2);
	System.out.println(c1);
	boolean retainall=c1.retainAll(c2);
	System.out.println(c1+" judge retainAll() "+retainall);
	
	
	}

}
