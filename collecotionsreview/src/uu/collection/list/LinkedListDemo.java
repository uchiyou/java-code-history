package uu.collection.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList link=new LinkedList();
		show(link);

	}
	private static void show(LinkedList link){
		link.addFirst("xiaoqiang1 ");
		link.addFirst("xiaoqiang2 ");
		link.addFirst("xiaoqiang3 ");
		/*for(Iterator it=link.iterator();it.hasNext();)
		System.out.println(it.next());
		while(!link.isEmpty()){
			System.out.println(link.removeLast());
			*/
		System.out.println(link.getFirst());
		System.out.println(link.getFirst());
		System.out.println(link.getFirst());
		}
		
	}


