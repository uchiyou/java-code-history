package class1.exercise;

import java.lang.reflect.InvocationTargetException;

public class Method {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws NoSuchMethodException 
	 * @throws SecurityException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, SecurityException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
	//	Class clas=Class.forName("reject.class1.exercise.ForTest");
	//	Object obj=clas.newInstance();
		
		Class clas=ForTest.class;
		Object obj=clas.newInstance();
		
		/*
		java.lang.reflect.Method m=clas.getMethod("show",null);
		m.invoke(obj, null);
		*/
		
	//	@SuppressWarnings("unchecked")
		java.lang.reflect.Method me=clas.getDeclaredMethod("exercise",String.class,int.class,char.class);
		me.setAccessible(true);
		me.invoke(obj, "xiaoqiang",7,'u');
		
		/*
		java.lang.reflect.Method[] methods=clas.getMethods();
		for(java.lang.reflect.Method m1 : methods){
			System.out.println(m1.toString());
			
		}*/
		
		
		
		
		

	}

}
