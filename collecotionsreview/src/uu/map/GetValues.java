package uu.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GetValues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Map<Integer,String> map=new HashMap<Integer,String>();
	show(map);

	}
	public static void show(Map<Integer,String> map)
	{
		map.put(11,"zhangwei");
		map.put(22,"luziqiao");
		map.put(33,"zhengxiaoxian");
		map.put(44,"guanggu");
		System.out.println(map);
		Collection<String> str=map.values();
		int size=str.size();
		System.out.println("the map contains "+size+" elements");
		for(Iterator<String> it=str.iterator();it.hasNext();){
			System.out.println(it.next());
			
		}
	}

}
