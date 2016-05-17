package uu.collection.set;

import java.util.Comparator;
import java.util.HashSet;

public class ComparatorDemo implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		/*Plant p=(Plant)o1;
		Plant p2=(Plant)o2;
		int temp1=p.getValue()-p2.getValue();
		return 0;
		return temp1==0?p.getName().compareTo(p2.getName()) : temp1;
		return 1;*/
		String str1=(String)o1;
		String str2=(String)o2;
		int temp=str1.length()-str2.length();
		return temp==0?str1.compareTo(str2) : temp;
	}
	
}


