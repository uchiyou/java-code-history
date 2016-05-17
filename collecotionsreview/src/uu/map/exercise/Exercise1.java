package uu.map.exercise;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Exercise1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String exam="aheurk  243zhfxnv,brsfhe";
		show(exam);

	}
	public static void show(String str){
		char[] ch=str.toCharArray();
		TreeMap<Character,Integer> treemap=new TreeMap<Character,Integer>();
		for(int i=0;i<str.length();i++){
		//	if(ch[i]>'z'^ch[i]<'A'^(ch[i]>'Z'&&ch[i]<'a'))
			if(ch[i]>'z'||ch[i]<'A'||(ch[i]>'Z'&&ch[i]<'a'))
				continue;
		    Integer in=treemap.get(ch[i]);
			if(in==null){
				treemap.put(ch[i],1);
			}
			else
				treemap.put(ch[i],treemap.get(ch[i])+1);
			
			}
		
		System.out.println(treemap);
	System.out.println(style(treemap));
	
	}
	private static String style(TreeMap<Character,Integer> tree)
	{
		StringBuilder str=new StringBuilder();
		for(Iterator<Map.Entry<Character,Integer>> it=tree.entrySet().iterator();it.hasNext();){
		Map.Entry<Character,Integer> entry=it.next();
		str.append(entry.getKey()+"("+entry.getValue()+")");
		}
		return str.toString();
		/**if changed liked this :
		 * str.append(entry.getKey()+'('+entry.getValue()+')');
		 * then we will see a long number 
		 * why??????????????????
		 * 
		 * 
		 */
	}
		
	
	

}
