package uu.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListFoundation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList();
		show(list);

	}
	public  static void show(List list){
		list.add("hollow");
		list.add("java");
		list.add("android");
		//System.out.println(list);
		list.add(2,"take up android ");
		System.out.println(list);
	//	System.out.println(list.set(2,"chang android into php"));
		//System.out.println(list);
	//	System.out.println("get the 2 String "+list.get(2));
		//System.out.println("delete "+list.remove(2)+"   list    "+list);
	//	System.out.println("index   "+list.indexOf("java"));
		System.out.println("sublist  "+list.subList(1,3));
		
		
		
	}

}
