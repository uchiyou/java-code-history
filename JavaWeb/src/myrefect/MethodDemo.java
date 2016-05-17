package myrefect;

import java.lang.reflect.Method;

import org.junit.Test;

import first.Person;

public class MethodDemo {
	
	@Test
	public void test() throws Exception{
	Class cla=Class.forName("first.Person");
	Person p=(Person)cla.newInstance();
	 Method method=cla.getDeclaredMethod("hand", int.class);//是私有的
	method.setAccessible(true);//暴力访问
	method.invoke((Person)cla.newInstance(), 3);
	}
	//public int[] foot(String [] str){
	@Test
	public void test2() throws Exception{
		Class cla=Class.forName("first.Person");
		Person person=(Person) cla.newInstance();
		Method method=cla.getMethod("foot",String[].class);
		String str[]={"hah","yy","uu"};
		
		/*int[] a=(int[])method.invoke(person,new String[]{"hah","yy","uu"});
		 * 
		 * why is a error??
		 * 
		 * */
		int[] a=(int[])method.invoke(person,new Object[]{new String[]{"hah","yy","uu"}});
		
		for(int i:a)
			System.out.println(i+"...");
	}
	@Test
	public void test3() throws Exception{
		Class cla=Class.forName("first.Person");
		Method method=cla.getMethod("head",null);
		method.invoke(null, null);
		/*
		 * static method needn't been given a Object
		 */
	}
	@Test
	public void testMain() throws Exception{
		Class cla=Class.forName("first.Person");
		Method method=cla.getMethod("main",String[].class);
		method.invoke(null, (Object)new String[]{"hah","uu"});//如果传递数组的话，在编译是会被拆分
	}
	
}
