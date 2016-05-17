package uu.collection.list;




public  class Person 
{
	private String name=null;
	private int age=0;
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		System.out.println("in hashCode ...."+this.getName());
		
		return 0;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("in equals ...."+this.getName());
		if(this==(Person)obj)
			return true;
		if(!(obj instanceof Person))
			return false;
		Person per=(Person)obj;
		
		return name.equals(per.getName())&&age==per.getAge();
	}
	Person(String name,int age){
		this.name=name;
		this.age=age;
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