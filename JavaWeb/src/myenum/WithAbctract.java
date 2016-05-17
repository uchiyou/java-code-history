package myenum;

import org.junit.Test;

public class WithAbctract {
	
	@Test
	public void test(){
		getValue(Grade.C);
	}
	
	public void  getValue(Grade g){
		System.out.println(g.localValue());
	}
	@Test
	public void test2(){
		System.out.println(Grade.A.name());
		System.out.println(Grade.A.ordinal());
		Grade g=Grade.valueOf("B");
		System.out.println(g.value);
		Grade grades[]=Grade.values();//get all of the elements in the enum
		for(Grade gra:grades){
			System.out.println(gra);
		}
	}
	
	
	
	 enum Grade{
		A("85-100"){
			public String localValue(){
				return "”≈";
			}
		},
		B("70-85"){
			public String localValue(){
				return "¡º";
			}
		},
		C("60-70"){
			public String localValue(){
				return "∫œ∏Ò";
			}
		},
		D("0-60"){
			public String localValue(){
				return "≤Ó";
			}
		};
		private String value=null;
		private Grade(String grade){
			value=grade;	
		}
		public String getGrade(){
			return value;
		}
		public abstract String localValue();
		
	}

}
