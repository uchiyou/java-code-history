package thread.communication;

import java.util.Random;

class Resource1{
	String name=null;
	String sex=null;
	Boolean flag=false;
}
class Input1 implements Runnable{
	Resource1 s=null;
	int number=1000;
	int i=4;
	Random random=new Random();
	Input1(Resource1 s)
	{
		this.s=s;
	}
	public void run(){
		while((number--)>0){
		i=i+1;
		synchronized(s){
			if(s.flag)
				try {
					s.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(i%2==0){
				
					
				
				s.name="westlife";
				s.sex="man";//System.out.println("est1    "+i+"   "+number);
				
			}
			else
			{
				s.name="ÖÜÑ¸";
				s.sex="Å®";
				//System.out.println("test2   "+i+"    "+number);
						
			}
			s.flag=true;
			s.notify();
			}
			
		}
	}
}
class Get1 implements Runnable{
	Resource1 s=null;
	int number=1000;
	int i=0;
	//Random random=new Random();
	Get1(Resource1 s)
	{
		this.s=s;
	}
	public void run(){
		while(number-->0){
			synchronized(s){
				if(!(s.flag))
					try {
						s.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				System.out.println(s.name+"....."+s.sex);
				s.flag=false;
				s.notify();
		}
		}
			
		}
	}




public class WaitNotify {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource1 r=new Resource1();
		Input1 input=new Input1(r);
		Get1 get=new Get1(r);
		Thread tinput=new Thread(input);
		Thread tget=new Thread(get);
		
		tget.start();
		try {
			Thread.sleep(6);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tinput.start();
		

	}

}
