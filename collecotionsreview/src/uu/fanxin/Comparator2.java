package uu.fanxin;

import java.util.Comparator;

public class Comparator2 implements Comparator<Animal>{

	@Override
	public int compare(Animal o1, Animal o2) {
		// TODO Auto-generated method stub
		int temp=o1.getWeight()-o2.getWeight();
		
		return temp==0?o1.getName().compareTo(o2.getName()) :temp;
	}

	
}
