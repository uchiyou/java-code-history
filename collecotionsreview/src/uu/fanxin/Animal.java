package uu.fanxin;

public class Animal extends Creation {
	//private String name=null;
	private int weight=0;
	Animal(){
		
	}
	public Animal(String name,int weight){
		this.name=name;
		this.weight=weight;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Animal  "+name+"..weight.."+weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	/*public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Animal a=(Animal)obj;
		return name.equals(a.getName());
	}*/
	public int hashCode(){
		//int hash=name.length()*weight*2345;
		return name.hashCode()*weight;
		
	}
	
	

}
