package regex;

public class Matches {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number="18198238";
		String regex="1[358]\\d{9}";
		boolean test=number.matches(regex);
		System.out.println(test);

	}

}
