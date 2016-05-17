package E;

public class ExerciseDemo {
	
	public void test(){
		int[] arr=new int[]{1,2,3,4,5,6,7};
		for(int i:arr)
			System.out.println(i);
				
		//		myswap(arr);
				
				for(int i:arr)
					System.out.println(i);
	}
	public static void main(String args[]){
		int[] arr=new int[]{1,2,3,4,5,6,7};
		for(int i:arr)
			System.out.println(i);
				
			//	myswap(arr);
				
				for(int i:arr)
					System.out.println(i);
		
	}
	
	
	public static <T> void myswap(T t[]){
		for(int i=0;i<t.length/2;i++){
			T temp=t[i];
			t[i]=t[t.length-1-i];
			t[t.length-1-i]=temp;
		}
	}

}
