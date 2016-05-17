package uu.map;

import java.util.HashMap;
import java.util.Map;

public class MethodDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m=new HashMap<Integer,String>();
		show(m);

	}
	public static void show(Map<Integer,String> map)
	{
		System.out.println(map.put(74,"li"));
		System.out.println(map.put(75,"lipinliang"));
		System.out.println("get  "+map.get(74));
		//System.out.println("remove  "+map.remove(75));
	//	System.out.println("clear  "+map.clear());
		map.clear();
		System.out.println(map);
	}

}
