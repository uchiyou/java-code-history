package uu.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Sort1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		show(list);

	}
	public static void show(List<String> list){
		list.add("zhoujielun");
		list.add("zhangjie");
		list.add("hai");
		list.add("wangzhishang");
		System.out.println(list);
		//Collections.sort(list);
		Collections.sort(list,new Comparartor1());
		System.out.println(list);
	}

}
