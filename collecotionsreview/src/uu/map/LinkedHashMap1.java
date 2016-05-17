package uu.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LinkedHashMap<Integer,String> linked=new LinkedHashMap<Integer,String>();
		HashMap<Integer,String> linked=new HashMap<Integer,String>();
		show(linked);

	}
	public static void show(HashMap<Integer,String> link)
	{
		link.put(23,"wangbaoqiang");
		link.put(56,"zhangjintao");
		link.put(19,"qibao");
		link.put(24,"wangbaoqiang");
		link.put(5,"zhangjintao");
		link.put(2,"wangbaoqiang");
		link.put(78,"zhangjintao");
		//for(Iterator<Map.Entry<Integer,String>> it=link.entrySet().iterator();it.hasNext();)
		Set<Map.Entry<Integer,String>> entryset=link.entrySet();
		for(Iterator<Map.Entry<Integer,String>> it=entryset.iterator();it.hasNext();){
			Map.Entry<Integer,String> map=it.next();
			System.out.println(map.getKey()+"......"+map.getValue());
		}
	}

}
