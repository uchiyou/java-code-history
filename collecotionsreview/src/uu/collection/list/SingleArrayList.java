package uu.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
public class SingleArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar=new ArrayList();
		show(ar);

	}
	private static void show(ArrayList array){
		array.add(new Person("xiaoqiang",12));
		array.add(new Person("daqiang",13));
		array.add(new Person("zhongqiang",14));
		array.add(new Person("xiaoqiang",12));
		array.add(new Person("daqiang",13));
		array.add(new Person("zhongqiang",14));
		System.out.println(array);
		array=single(array);
		System.out.println(array);
		
	}
	private static ArrayList single(ArrayList ar){
		ArrayList temp=new ArrayList();
		for(Iterator it=ar.iterator();it.hasNext();){
			Object obj=it.next();
			if(!(temp.contains(obj)))//if contains the object then will return false,if not contain 
				//will return true
			temp.add(obj);
		}
		return temp;
	}

}
