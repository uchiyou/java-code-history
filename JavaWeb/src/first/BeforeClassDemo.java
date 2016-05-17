package first;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeClassDemo {
	
	
	@BeforeClass
	public static void tstBeforeCla(){//����δ����ʱ���г���
		System.out.println("beforeclass");
		
	}
	
	@Test
	public void testRead(){
		
		Person p=new Person();
		p.read();
	}
	@Test
	public void testStudy(){
		Person p=new Person();
		p.study();
	}
	@AfterClass
	public static void testAfter(){
		System.out.println("afterclass");
	}
	
	

}
