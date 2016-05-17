package thread.interrupt;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Task implements Runnable{
	private boolean flag=true;
	Lock lock=new ReentrantLock();
	private int count=0;
	Condition con=lock.newCondition();
	
	public void run(){
		lock.lock();
		while(flag){
				try {
					System.out.println(Thread.currentThread().getName()+".....sleep");
					con.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println(Thread.currentThread().getName()+"......awake");
				}
			System.out.println(Thread.currentThread().getName()+"......for test...."+count++);
		}
		
		lock.unlock();
	}
	public void setflag(){
		flag=false;
	}
	
	
}
public class Interrupt1 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Task t=new Task();
		Thread th1=new Thread(t);
		Thread th2=new Thread(t);
		System.out.println("thread start ...");
		th1.setDaemon(true);
		th2.setDaemon(true);
		th1.start();
		th2.start();
		Thread.sleep(100);
		for(int i=1;i<100;i++){
			if(i==99){
				t.setflag();
				
				//th1.interrupt();
				//th2.interrupt();
			}
		}
		
		

	}

}
