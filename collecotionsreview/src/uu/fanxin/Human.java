package uu.fanxin;

public class Human extends Creation {
	//private String name;
	private int age;
	Human()
	{
		
	}
	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Human "+name+"...age'."+age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
