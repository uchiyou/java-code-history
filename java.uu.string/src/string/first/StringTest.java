package string.first;

public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hellow";
		String str1="hellow";
		System.out.println(str==str1);
		System.out.println(str.length());
		System.out.println(str.charAt(3));
		System.out.println(str.indexOf("llow"));
		System.out.println(str.startsWith("hel"));
		System.out.println(str.substring(2));
		System.out.println(str.substring(2,4));
		System.out.println(str.replace('l','o'));
		System.out.println(str.concat(" zhouyou"));
		String num="123";
		System.out.println(Integer.parseInt(num)-100);
		

	}

}
