package socket.udp.review1;
import java.net.*;
import java.io.*;

public class ChatReceive {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		DatagramSocket receive=new DatagramSocket(10002);
		byte[] by=new byte[1024];
		String str=null;
		DatagramPacket pack=new DatagramPacket(by,by.length);System.out.println("test 1");
		receive.receive(pack);System.out.println("test 2");
		String ip=pack.getAddress().getHostAddress();
		int port=pack.getPort();
		/*while(!("886".equals(new String(pack.getData()))));
		{
			str=new String(pack.getData(),0,pack.getLength());
			System.out.println("From ip :"+ip+" port : "+port+" content : "+str);
			receive.receive(pack);
			
		}*/
		while(true){
			str=new String(by,0,pack.getLength());
			//if(str.equals("886")) break;
			
			System.out.println("IP : "+ip+" port : "+port+" content : "+str);
			if("886".equals(str)) break;
			receive.receive(pack);
		}
		receive.close();

	}

}/*
IP : 127.0.0.1 port : 49192 content : haha
IP : 127.0.0.1 port : 49192 content : xixi
IP : 127.0.0.1 port : 49192 content : 86xi
  */
