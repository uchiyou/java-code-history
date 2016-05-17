package uu.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
//import java.util.Map.Entry;
import java.util.Set;

public class GetAll2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<Integer,String>();
		show(map);

	}
	public static void show(Map<Integer,String> map){
		map.put(11,"dog");
		map.put(22,"castle");
		map.put(33,"foundry");
		map.put(44,"refinery");
		System.out.println(map);
	//	@SuppressWarnings("unchecked")
		Set<Map.Entry<Integer,String>> entrySet= map.entrySet();
		for(Iterator<Map.Entry<Integer,String>> it=entrySet.iterator();it.hasNext();){
		Map.Entry<Integer,String> mapentry=it.next();
		System.out.println(mapentry.getKey()+"..."+mapentry.getValue());
		}
		
		
	}

}
