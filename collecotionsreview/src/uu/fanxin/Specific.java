package uu.fanxin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Specific {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("hellow");
		ar.add("world");
		ar.add("java");
		
		ArrayList<Human> ar1=new ArrayList<Human>();
		ar1.add(new Human("zhangshang",23));
		ar1.add(new Human("xiaoqiang",24));
		ar1.add(new Human("lishi",15));
		show(ar1);
		LinkedList<Animal> li=new LinkedList<Animal>();
		li.add(new Animal("hellow",23));
		li.add(new Animal("world",45));
		li.add(new Animal("java",46));
		show(li);
		

	}
	public static void show(List<? extends Creation> str){
		for(Iterator<? extends Creation> it=str.iterator();it.hasNext();){
			System.out.println(it.next().getName());
		}
	}

}
