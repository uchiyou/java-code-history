package E;

import org.junit.Test;

public class  EDemo{// define a globe type ,they can't been saw in static method

	@Test
	public void test(){
		System.out.println(testE("string test"));
		/*
		 * 	useGlobe("String");
		 * 
		 * when K been defined in globe ,why can't use the sentence
		 */
	}
	
	public <K> void useGlobe(K i){
		System.out.println(i);
	}
	public static <K> K testStatic(K k){
		
		return k;
	}
	
	public <T> T testE(T t){//<T> is to claim a unknown type,  
		/*
		 *      <T> T the late T is mean return a T type,
		 *      testE(T t) is mean should been gave a T type
		 */
		System.out.println(t);
		return t;
	}

}
