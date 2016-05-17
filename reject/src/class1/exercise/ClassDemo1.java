package class1.exercise;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ClassDemo1 {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws NoSuchMethodException 
	 * @throws SecurityException 
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws IllegalArgumentException 
	 * @throws NoSuchFieldException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, SecurityException, NoSuchMethodException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
		// TODO Auto-generated method stub
		//                                     Class
	/*	ForTest f=new ForTest("xiaoqiang ",23);
		Class<?> c1=f.getClass();
	*/	Class<ForTest> c2=ForTest.class;
		
		Class<ForTest> c3=(Class<ForTest>) Class.forName("class1.exercise.ForTest");
	//	System.out.println(c1);
	//	System.out.println((c1==c2)&&(c2==c3));
		
		/*                    Constructor class
		java.lang.reflect.Constructor<?> constructor=c2.getDeclaredConstructor(String.class,int.class);
		
		ForTest test=(ForTest)constructor.newInstance("haha",5);
		System.out.println(test);
		*/
		
		//                  Field  class
		Field f=c3.getDeclaredField("t");
		f.setAccessible(true);
		System.out.println(f);
		
		//                get the field value
		Object obj=c2.newInstance();
		ForTest fortest=(ForTest)obj;
		f.set(obj, 78);
     	Object o=f.get(obj);
		System.out.println(o);
		
		
		

	}

}
