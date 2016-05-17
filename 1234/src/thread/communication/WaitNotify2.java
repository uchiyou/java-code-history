package thread.communication;

import java.util.Random;

class Resource2{
	private String name=null;
	private String sex=null;
	private Boolean flag=false;
	public synchronized void set(String name,String sex)
	{
		if(this.flag)
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		this.name=name;
		this.sex=sex;
		this.flag=true;
		this.notify();
	}
	public synchronized void get(){
		if(!(this.flag))
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println(name+"......"+sex);
		this.flag=false;
		this.notify();
	}
	
}
class Input2 implements Runnable{
	Resource2 s=null;
	int number=1000;
	int i=4;
	Random random=new Random();
	Input2(Resource2 s)
	{
		this.s=s;
	}
	public void run(){
		while((number--)>0){
		i=i+1;
			
			if(i%2==0)
				s.set("westlife","man");
			else
			s.set("tanguu","woman");
		}
	}
}
class Get2 implements Runnable{
	Resource2 s=null;
	int number=1000;
	int i=0;
	Get2(Resource2 s)
	{
		this.s=s;
	}
	public void run(){
		while(number-->0)
		s.get();
		}
	}
public class WaitNotify2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource2 r=new Resource2();
		Input2 input=new Input2(r);
		Get2 get=new Get2(r);
		Thread tinput=new Thread(input);
		Thread tget=new Thread(get);
		tget.start();
		tinput.start();
	}

}
