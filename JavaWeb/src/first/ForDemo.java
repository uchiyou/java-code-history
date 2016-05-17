package first;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class ForDemo {
	@Test//Map集合的第一种取出元素方式
	public void test1(){
		//LinkedHashMap是用队列来实现的
		//HashMap是用Hash算法来存储元素
		Map<String,String> map=new LinkedHashMap<String,String>();
		map.put("1","uu");
		map.put("2","zhouyou");
		map.put("3", "uchiyou");
		Set<String> keys=map.keySet();
		Iterator<String> it=keys.iterator();
		while(it.hasNext()){
			String key=it.next();
			System.out.println(key+" = "+map.get(key));
		}
	}
	//map集合的第二种元素取出方式
	@Test
	public void test2(){
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"xiaoqiang");
		map.put(2, "qangcai");
		map.put(3, "value");
		Set<Map.Entry<Integer, String>> entry=map.entrySet();
		Iterator<Map.Entry<Integer,String>> it=entry.iterator();
		while(it.hasNext()){
			Map.Entry<Integer, String> e=it.next();
			System.out.println(e.getKey()+"   "+e.getValue());
		}
	}

}
