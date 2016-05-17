package myrefect;

import java.lang.reflect.Field;

import org.junit.Test;

import first.Person;

public class FieldDemo {
	@Test
	public void test() throws Exception{
		Class cla=Class.forName("first.Person");
		Field uu=cla.getField("name");
		Person p=(Person) cla.newInstance();
		Class type=uu.getType();
		if(type.equals(String.class)){
			String str=(String) uu.get((Person)cla.newInstance());//need to point which Object
			System.out.println(str);
	}
		uu.set(p, "haha");
		System.out.println(uu.get(p));
		}

}
