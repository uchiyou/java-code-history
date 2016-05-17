package udp.again;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Receive {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket receive=new DatagramSocket(10001);
		byte[] b=new byte[1024];
		DatagramPacket pack=new DatagramPacket(b,b.length);
		String str=null;
		while(true){
		
		receive.receive(pack);
		System.out.println(pack.getLength());
		str=new String(pack.getData(),0,pack.getData().length);
		str=str+"\n";
		System.out.println(str);
		if(str.equals("886"))
			break;
		}
		receive.close();
		
	}

}
