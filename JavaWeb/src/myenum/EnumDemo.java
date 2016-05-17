package myenum;

import org.junit.Test;

public class EnumDemo {
	
	@Test
	public void test(){
		overSee(Grade.A);
		
	}
	
	public void overSee(Grade g){
		System.out.println(g.getValue());
	}
	
	
	
	enum Grade{
		A("100-85"),B("85-70"),C("70-60"),D("60-0");
		private String value;
		private Grade(String grade){
			value=grade;
		}
		public String getValue(){
			return value;
		}
	}

}
