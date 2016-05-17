package thread.comsume_customes;
class InterSource{
	private String good;
	private int count=1;
	Boolean flag=true;
	public synchronized void produce(String good){
		this.good=good;
		while(flag){
		//	this.notify();
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		++count;
		this.good=this.good+count;
		System.out.println(Thread.currentThread().getName()+"..produce.. "+this.good);
		flag=true;
		this.notifyAll();
	}
	public synchronized void consume(){
		while(!(flag))
		{
			//this.notify();
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+".....consume....."+this.good+count);
		//why here this.good don't include the count while there contain in produce  
		//why here need "+count"
		flag=false;
		this.notifyAll();
	}
}
class Produce implements Runnable{
	InterSource is=null;
	int num=200;
	Produce(InterSource is){
		this.is=is;
	}
	public void run(){
		while(num-->0)
		is.produce("clothes");
	}
}
class Consume implements Runnable{
	InterSource is=null;
	int num=200;
	Consume(InterSource is){
		this.is=is;
	}
	public void run(){
		while(num-->0)
		is.consume();
	}
}

public class WhileNotifyAll {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterSource is=new InterSource();
		Produce produce=new Produce(is);
		Consume consume=new Consume(is);
		Thread pro0=new Thread(produce);
		Thread pro1=new Thread(produce);
		Thread con2=new Thread(consume);
		Thread con3=new Thread(consume);
		pro0.start();
		pro1.start();
		con2.start();
		con3.start();

	}

}
