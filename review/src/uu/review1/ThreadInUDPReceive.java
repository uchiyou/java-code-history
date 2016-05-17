package uu.review1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

import javax.swing.JTextArea;

public class ThreadInUDPReceive implements Runnable{
	private int port=-1;
	private JTextArea jta=null;
	
	
	public ThreadInUDPReceive(int port,JTextArea jta) {
		super();
		if(port<0||port>65025)
		{
			System.out.println("the port is illegal");
			System.exit(0);
		}
		this.port = port;
		this.jta=jta;
	}
	
	public ThreadInUDPReceive() {
		
	}



	public void run(){
		try {
			DatagramSocket ds=new DatagramSocket(port);
			
			byte [] b=new byte[1024];
			String str=null;
			
	//		DatagramPacket dp=new DatagramPacket(b,b.length,port);
			DatagramPacket dp=new DatagramPacket(b,b.length);
			do{
				ds.receive(dp);
				str=new String(dp.getData(),0,dp.getLength());
				System.out.println(new String(dp.getData()));
				jta.append(str);
				
			}while(!str.equals("@#$%"));
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	

}
