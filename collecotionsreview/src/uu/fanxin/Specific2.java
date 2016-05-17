package uu.fanxin;

import java.util.ArrayList;
import java.util.Iterator;

public class Specific2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<Creation> ar=new ArrayList<Creation>();
	show(ar);
//	ArrayList<Human> h=new ArrayList<Human>();
	
	//show2(h);
	

	}
	
	public static void show(ArrayList<Creation> ar){
		ar.add(new Animal("pig",23));
		ar.add(new Animal("duck",8));
		display(ar);
	}
/*	public static void show2(ArrayList<? extends Creation> h){
		//h.add(new Human("xiaoqiang",2));
		h.add(new Creation());
	//	h.add(new Human("yaya",43));
		display(h);
		*
		*why can't add more elements in the area whatever Human or ANimal even Creation
		*
		*
	}   */
	public static void display(ArrayList<? extends Creation> a){
		for(Iterator<? extends Creation> it=a.iterator();it.hasNext();){
			System.out.println(it.next());
		}
	}

}
