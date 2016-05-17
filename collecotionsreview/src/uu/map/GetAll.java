package uu.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GetAll {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<Integer,String>();
		show(map);

	}
	public static void show(Map<Integer,String> map){
		map.put(1,"xiaoqiang");
		map.put(2,"zhongqinag");
		map.put(3,"daqiang");
		map.put(4,"chaoqiang");
		System.out.println(map);
	
		
		
		
		Set<Integer> keySet=map.keySet();
		for(Iterator<Integer> it=keySet.iterator();it.hasNext();){
			Integer key=0;
			key=it.next();
			System.out.println("key .."+key+" ..value  "+map.get(key));
			}
			
			
		}
	}


