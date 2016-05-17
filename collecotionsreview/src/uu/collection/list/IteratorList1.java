package uu.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorList1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList();
	show(list);

	}
	private static void show(List list){
		list.add("when i ");
		list.add("go home");
		list.add("next month");
/*		Iterator it=list.iterator();
 * while(it.hasNext()){
		System.out.println(it.next());
 */
		for(ListIterator it=list.listIterator();it.hasNext();){
			System.out.println(it.next());
		}
	
		
	}
	
	
}
