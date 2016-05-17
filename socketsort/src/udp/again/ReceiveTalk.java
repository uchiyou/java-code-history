package udp.again;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveTalk {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket receive=new DatagramSocket(10002);
		byte[] b=new byte[1024];
		DatagramPacket pack=new DatagramPacket(b,b.length);
		
		while(true)
		{
			
			receive.receive(pack);
			String ip=pack.getAddress().getHostAddress();
			int port=pack.getPort();
			System.out.println(ip+":"+port);
			String str=new String(pack.getData(),0,pack.getLength());
			System.out.println(str);
			if(str.equals("886"))
				break;
			
		}
		receive.close();

	}

}
