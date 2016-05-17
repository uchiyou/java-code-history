package first;

import org.junit.Test;

public class ChangAbleParater {
	
	public int add(int ...num){
		int sum=0;
		for(int i:num)
			sum+=i;
		return sum;
	}
	@Test
	public void test(){
		System.out.println(add(21,2,3,1));
		int par[]={1,23,4,4};
		System.out.println(add(par));
	}

}
