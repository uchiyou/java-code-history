
class Task implements Runnable{
	private int num=100;
	public void run(){
		
		show();
	}
	public synchronized void show(){
		//synchronized(this.getClass()){
		while(num>0){
	try {
		Thread.sleep(3);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		System.out.println(Thread.currentThread().getName()+"this is the "+num--+" time ");
		
	}
	//	}
	}
	
}
public class ThreadSynchronized {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task task=new Task();
		Thread thread1=new Thread(task);
		Thread thread2=new Thread(task);
		Thread thread3=new Thread(task);
		System.out.println("thread start");
		thread1.start();
		thread2.start();
		thread3.start();
		

	}

}
