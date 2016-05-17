package uu.fanxin;

interface Inter0<T> {
	public static final int a=2;
	public void show(T t);
	

}
/*public class Inter<P> implements  Inter0<P>{
 * public static final int a=2;
    public void show(P p){
    	System.out.println("show "+p);
    	
    }
}

 */

public class Inter implements Inter0<String>{
	public void show(String str){
		System.out.println(str);
	}
}
	