package test;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Test extends KeyAdapter{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t=new Test();
		for(int i=0;i<100;i++){
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}


}
