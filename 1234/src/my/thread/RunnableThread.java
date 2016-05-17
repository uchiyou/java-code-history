package my.thread;
class DemoRunnable implements Runnable{
	public void run()
	{
		//display();
		for(int i=0;i<10;i++){
			System.out.println("This is "+i+" time");
		}
	}
/*	public void display(){
		for(int i=0;i<10;i++){
			System.out.println("This is "+i+" time");
		}
	}*/
}

public class RunnableThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start the thread ");
		DemoRunnable test=new DemoRunnable();
		Thread NO1=new Thread(test);
		Thread NO2=new Thread(test);
		NO1.start();
		NO2.start();
		
		

	}

}
