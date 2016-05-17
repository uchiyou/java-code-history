package uu.collection.set;

import java.util.Iterator;
import java.util.TreeSet;
class Plant implements Comparable{
	private String name=null;
	private int value=0;
	Plant(String name,int value)
	{
		this.name=name;
		this.value=value;
	}
	public String getName(){
		return name;
	}
	public int getValue(){
		return value;
	}
	public int  compareTo(Object o)
	{
		Plant p=(Plant)o;
		int temp=value-p.getValue();
		int tname=name.compareTo(p.getName());
		return (value==p.getValue())?(name.compareTo(p.getName())):(value-p.getValue());
	}
	
}

public class TreeSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet tree=new TreeSet(new ComparatorDemo());
		show(tree);

	}
	private static void show(TreeSet tr){
	/*	tr.add("tree");
		tr.add("plant");
		tr.add("tree");
		tr.add("plant");
		tr.add("fruits");
		*/
		tr.add(new Plant("maple",23));
		tr.add(new Plant("apple",45));
		tr.add(new Plant("pine",24));
		tr.add(new Plant("pear",34));
		tr.add(new Plant("maple",24));
		tr.add(new Plant("bamboo",2));
	//	tr.add(new Plant("apple",24));
	//	tr.add(new Plant("pine",24));
		for(Iterator it=tr.iterator();it.hasNext();){
			Plant p=(Plant)it.next();
			System.out.println(p.getName()+"...."+p.getValue());
		}
	}

}
