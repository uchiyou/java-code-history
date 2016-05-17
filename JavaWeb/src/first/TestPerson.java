package first;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestPerson {
	
	
	Person p;
	@Before
	public void before(){
		p=new Person();
		System.out.println("before");
		
	}
	
	@Test
	public void testRead(){
		
		p.read();
	}
	@Test
	public void testStudy(){
		p.study();
	}
	@After
	public void after(){
		p=null;
		System.out.println("after");
	}

}
