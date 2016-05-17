package class1.exercise;

public class ForTest {
	private String name;
	private int t;
	ForTest(String name,int t){
		this.name=name;
		this.t=t;
		show();
	}
	ForTest(){
	//	name="xiaoqiang";
	//	t=9;
		show();
	}
	private void exercise(String str,int in,char g){
		System.out.println(str+"  :  "+in+" : "+g);
	}
	public String getName() {
		
		exercise(name,t,'h');
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getT() {
		return t;
	}
	public void setT(int t) {
		this.t = t;
	}
	public void show(){
		System.out.println("name : "+name+" value : "+t);
	}

}
