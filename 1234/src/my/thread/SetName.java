package my.thread;
class ThreadSetName extends Thread
{
	//private String name=null;
 ThreadSetName(String name){
		super(name);
		
	}

	public void run(){
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<100000;j++){
				
			}
			System.out.println("haha "+i+" time "+Thread.currentThread().getName());
		}
		
	}
}
public class SetName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this program will set name for thread and show which is in running
		ThreadSetName no1=new ThreadSetName("no1");
		ThreadSetName no2=new ThreadSetName("no2");
		System.out.println(" no1 thread start "+Thread.currentThread().getName());
		no1.start();
		System.out.println("no2 thread start "+Thread.currentThread().getName());
		no2.start();
		
		

	}

}
