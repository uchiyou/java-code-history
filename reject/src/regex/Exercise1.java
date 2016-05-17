package regex;

public class Exercise1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="iiiiiiiiiiii   'mmmmmmmmm ttttt iiiiiirrrrrrreeeedddddddddd   ,,,,,,rrrreeeeeeelaxed";
		
		str=str.replaceAll(" +", "");
		System.out.println(str);
		
		str=str.replaceAll("(.)\\1+","$1");
		System.out.println(str);

	}

}
