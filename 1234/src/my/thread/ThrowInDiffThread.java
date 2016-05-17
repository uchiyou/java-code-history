package my.thread;
class MyThread extends Thread{
	MyThread(){
}
	MyThread(String name)
	{
		super(name);
		start();
	}
	public void run(){
		for(int i=0;i<10;i++)
		{
			System.out.println("this is : "+i+" time "+Thread.currentThread().getName());
			//System.out.println(4/0);
		}
		//System.out.println(4/0);
	}
		
	}

public class ThrowInDiffThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyThread("test");
		int[] hi=new int[3];
		System.out.println(hi[8]);
		//test.start();
		System.out.println("just a test ");
		new MyThread("test2");
		new MyThread("test3");

	}

}
