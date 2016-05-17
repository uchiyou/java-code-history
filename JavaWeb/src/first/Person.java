package first;

public class Person {
	
	public String name="zhouyou";
	public void read(){
		System.out.println("read book");
		
	}
	public String study(){
		System.out.println("study java");
		read();
		return "uu";
	}
	public static void head(){
		System.out.println("test static method");
	}
	public int[] foot(String [] ar){
			System.out.println(ar);
				return new int[]{2,4,5,2};
	}
	private String hand(int which){
		System.out.println(which+"  hand");
		return "hand";
	}
	public Person(){
		System.out.println("person");
	}
	public Person(String name){
		System.out.println("person  "+name);
	}
	private Person(int age){
		System.out.println("Person "+age);
	}
	public static void main(String args[]){
		System.out.println("in main");
	}
	
}
