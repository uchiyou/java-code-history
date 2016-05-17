package uu.fanxin;

import java.util.Iterator;
import java.util.TreeSet;

//import uu.collection.list.Person;

public class TreeSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Animal> tr=new TreeSet<Animal>(new Comparator2());
		show(tr);
	}
	public static void show(TreeSet<Animal> tr)
	{
		tr.add(new Animal("cat",2));
		tr.add(new Animal("tiger",57));
		tr.add(new Animal("shark",5766));
		tr.add(new Animal("cat",2));
		for(Iterator<Animal> it=tr.iterator();it.hasNext();){
			Animal a=it.next();
			System.out.println(a.getName()+"...."+a.getWeight());
		}
			
	}

}
