package my.thread;
class MyThread1 extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
		for(int j=0;j<10000;j++){
		}
		//System.out.println("this is : "+i+" time "+getName());
		System.out.println("this is  : "+i+" time "+Thread.currentThread().getName());
		}
	}
}
class MyThread2 extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			for(int j=0;j<10000;j++)
			{
			}
			//System.out.println("哈哈,这是  "+i+"  time"+getName());
			System.out.println("哈哈，这是 "+i+"  time "+Thread.currentThread().getName());
		}
	}
}
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 thread1=new MyThread1();
		MyThread2 thread2=new MyThread2();
		System.out.println("thread1 start....."+Thread.currentThread().getName());
		thread1.start();
		System.out.println("thread2 start ......."+Thread.currentThread().getName());
		thread2.start();

	}

}
