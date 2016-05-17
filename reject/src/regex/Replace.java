package regex;

public class Replace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		String str="uujjjjjjjjjjjsoftwarejjjjjjj2013uuuuuu19oooooooohunan";
		//	String s=str.replaceAll("(.)\\1+","*");
		String s=str.replaceAll("(.)\\1+","$1");//$can use the last regex 
		System.out.println(s);
		*/
		
		//小括号有封装成组的概念，
		String str="18191268238";
		String s=str.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1***$2");
		System.out.println(s);
		
		
		

	}

}
