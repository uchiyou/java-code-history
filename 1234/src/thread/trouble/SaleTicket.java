package thread.trouble;
class Sale extends Thread{
	private static int num=50;
	public void run(){
	for(;num>0;num--)
		System.out.println(Thread.currentThread().getName()+" sale the "+num+" ticket");
}
}
public class SaleTicket {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sale no1=new Sale();
		Sale no2=new Sale();
		Sale no3=new Sale();
		Sale no4=new Sale();
		no1.start();
		no2.start();
		no3.start();
		no4.start();
		

	}

}
