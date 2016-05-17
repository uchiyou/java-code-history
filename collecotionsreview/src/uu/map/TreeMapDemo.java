package uu.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import uu.fanxin.Animal;
import uu.fanxin.Comparator2;

public class TreeMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Animal,String> treemap=new TreeMap<Animal,String>(new Comparator2());
		show(treemap);
		
	}
	public static void show(TreeMap<Animal,String> treemap){
		treemap.put(new Animal("xiaoqiang",23),"woods");
		treemap.put(new Animal("zhongqinag",45),"glasses");
		treemap.put(new Animal("daqian",56),"forest");
		treemap.put(new Animal("zhongqinag",45),"glasses");
		treemap.put(new Animal("daqian",56),"forest");
		/*Set<Animal> keySet=treemap.keySet();
		/*for(Iterator<Animal> it=keySet.iterator();it.hasNext();){
			Animal a=it.next();
			System.out.println(a+" live "+treemap.get(a));
		}*/
		Set<Entry<Animal,String>> entrySet=treemap.entrySet();
		for(Iterator<Map.Entry<Animal,String>> it=entrySet.iterator();it.hasNext();){
			Map.Entry<Animal,String> me=it.next();
			System.out.println(me.getKey()+"...."+me.getValue());
		}
		
		
	}

}
