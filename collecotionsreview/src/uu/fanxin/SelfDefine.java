package uu.fanxin;

public class SelfDefine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tools<Animal> t=new Tools<Animal>();
		t.setKind(new Animal("dog",23));
		t.show();
		Tools<String> tool=new Tools<String>();
		tool.setKind("hellow");
		tool.show();
		//t.setKind(new Human("no1",55));
		
		

	}

}
