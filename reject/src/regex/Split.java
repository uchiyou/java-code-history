package regex;

public class Split {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String student="uu      software 2013 19 hunan";
		String [] info =student.split(" +");
		
		String student="uu.software.2013.19.hunan";
		String [] info =student.split("\\.");
		*/
		
		String student="uujjjjjjjjjjjsoftwarejjjjjjj2013uuuuuu19oooooooohunan";
		String [] info =student.split("(.)\\1+");
		
		for(String in : info){
			System.out.println(in);
		}

	}

}
