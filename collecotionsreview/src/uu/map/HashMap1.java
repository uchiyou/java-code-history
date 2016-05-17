package uu.map;

import java.util.HashMap;
import java.util.Iterator;

import uu.fanxin.Animal;

public class HashMap1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Animal,String> hashmap=new HashMap<Animal,String>();
		show(hashmap);
		

	}
	public static void show(HashMap<Animal,String> hashmap){
		hashmap.put(new Animal("elephdol",2345),"africa");
		hashmap.put(new Animal("tiger",345),"americian");
		hashmap.put(new Animal("monister",1000000),"tale");
		hashmap.put(new Animal("tiger",345),"americian");
		hashmap.put(new Animal("monister",1000000),"tale");
		for(Iterator<Animal> it=hashmap.keySet().iterator();it.hasNext();){
			Animal a=it.next();
			System.out.println(a+"  live "+hashmap.get(a));
		}
	}

}
