package clazz.extend;

import class1.exercise.ForTest;

public class Test {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class fortest=ForTest.class;
		Class f2=Class.forName("class1.exercise.ForTest");
		
				System.out.println(f2);
				

	}

}
