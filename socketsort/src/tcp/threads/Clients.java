package tcp.threads;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Calendar;

public class Clients implements Runnable{
	private Socket client;
	
	public Clients(Socket client){
		this.client=client;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//accept jpg files exercise
		String ip=client.getInetAddress().getHostAddress();
		System.out.println(ip+"...come in");
		try {
			BufferedInputStream bufIn=new BufferedInputStream(client.getInputStream());
			PrintStream printOut=new PrintStream(client.getOutputStream());
			
			Calendar calendar=Calendar.getInstance();
			int day=calendar.get(Calendar.DAY_OF_MONTH);
			int hour=calendar.get(Calendar.HOUR);
			int minute=calendar.get(Calendar.MINUTE);
			int second=calendar.get(Calendar.SECOND);
			
			File file=new File("E:\\Server\\"+day+"_"+hour+"_"+minute+"_"+second+".jpg");
			BufferedOutputStream buf=new BufferedOutputStream(new FileOutputStream(file));
			
			byte[] b=new byte[1024];
			int len=-1;
			
			while((len=bufIn.read(b))!=-1){
				buf.write(b,0,len);
				buf.flush();
			}
			client.shutdownInput();
			
			printOut.println("received ");
			buf.close();
			client.close();//no task,thread will close auto
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
