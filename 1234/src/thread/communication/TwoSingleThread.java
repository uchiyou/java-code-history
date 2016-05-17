package thread.communication;

import java.util.Random;

class Resource{
	String name=null;
	String sex=null;
}
class Input implements Runnable{
	Resource s=null;
	int number=1000000;
	int i=4;
	Random random=new Random();
	Input(Resource s)
	{
		this.s=s;
	}
	public void run(){
		while((number--)>0){
		i=i+1;
		synchronized(s){
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
			}
			
		}
	}
}
class Get implements Runnable{
	Resource s=null;
	int number=1000;
	int i=0;
	//Random random=new Random();
	Get(Resource s)
	{
		this.s=s;
	}
	public void run(){
		while(number-->0){
			synchronized(s){
				System.out.println(s.name+"....."+s.sex);
		}
		}
			
		}
	}




public class TwoSingleThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r=new Resource();
		Input input=new Input(r);
		Get get=new Get(r);
		Thread tinput=new Thread(input);
		Thread tget=new Thread(get);
		tinput.start();
		tget.start();
		

	}

}
