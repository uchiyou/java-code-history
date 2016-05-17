package myrefect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.junit.Test;

import first.Person;

public class RefectDemo {
	@Test
	public void test() throws ClassNotFoundException, SecurityException, NoSuchMethodException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException{
//	@SuppressWarnings("unchecked")
	Class<Person> cla= (Class<Person>)Class.forName("first.Person");//use package name with . and class name
	Constructor<Person> con=cla.getConstructor(null);
	Person p=(Person)con.newInstance(null);
	System.out.println(p);
	}
	@Test
	public void test2() throws Exception{
		Class<Person> cla= (Class<Person>)Class.forName("first.Person");//use package name with . and class name
		Constructor<Person> con=cla.getConstructor(String.class);
		Person p=(Person)con.newInstance("uu");
		System.out.println(p);
	}
	@Test
	public void test3() throws Exception{
		Class<Person> cla= (Class<Person>)Class.forName("first.Person");//use package name with . and class name
		Constructor<Person> con=cla.getDeclaredConstructor(int.class);
		/*
		 * int Ҳ��һ����,
		 * java�����е�Ԫ�ض����������ʽ���ص�
		 */
		con.setAccessible(true);//��������
		Person p=(Person)con.newInstance(89);
		System.out.println(p);
	}
	@Test
	public void test4() throws Exception{
		Class<Person> cla= (Class<Person>)Class.forName("first.Person");//use package name with . and class name
		Person p=cla.newInstance();
		System.out.println(p);
	}
}
