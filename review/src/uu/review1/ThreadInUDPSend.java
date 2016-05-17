package uu.review1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import javax.swing.JTextArea;

public class ThreadInUDPSend implements Runnable {
	
	private String ip=null;
	private int port=-1;
	private JTextArea jta=null;
	
	public ThreadInUDPSend(String ip,int port,JTextArea jta){
		String regex="([\\d]+){4}";
		if(((ip.matches(regex)))||port<0||port>65025)
		{
			System.out.println("socket address illegal");
			System.exit(0);
		}
		this.ip=ip;
		this.port=port;
		this.jta=jta;
		
	}
	public ThreadInUDPSend(){
		System.out.println("has not ip and port ");
		System.exit(0);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		 DatagramSocket ds=null;
		 DatagramPacket dp=null;
		
		
		String line=null;
		byte [] b=new byte[1024];
		
		try {
			ds=new DatagramSocket();
			dp=new DatagramPacket(b,b.length,InetAddress.getByName(ip),port);
			
   //     	BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
			
			while((line=jta.getText())!=null){
				b=line.getBytes();
				ds.send(dp);
				jta.setText("");
				if(line.equals("@#$%"))
					break;
				
			}
//			buf.close();
			
			
			
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
