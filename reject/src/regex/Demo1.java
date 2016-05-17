package regex;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex="[3-8][6-8][1-9]{3,6}";
		String num="368530";
		boolean is=num.matches(regex);
		System.out.println(is);

	}

}
