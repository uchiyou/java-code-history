package first;

import junit.framework.Assert;

import org.junit.Test;

public class AssertDemo {
	
	@Test
	public void testRead(){
		Person p=new Person();
		p.read();
		Assert.assertEquals("uu",p.study());
	}

}
