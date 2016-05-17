package uu.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BinaryList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	
		List<String> list=new LinkedList<String>();
		show(list);

	}
	public static void show(List<String> list){
		list.add("zhoujielun");
		list.add("zhangjie");
		list.add("hai");
		list.add("wangzhishang");
		list.add("hai");
		list.add("wangzhishang");
		//Collections.reverse(list);
		System.out.println(list);
		//Collections.sort(list);
		//Collections.sort(list,new Comparartor1());
		//System.out.println(list);
		/*int index=Collections.binarySearch(list, "hai");
		String str=Collections.max(list,new Comparartor1());
		System.out.println(index+str);
		Collections.fill(list,"haha");
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);*/
		
		

	}

}
