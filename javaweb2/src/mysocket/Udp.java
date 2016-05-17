package mysocket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Udp {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket udp=new DatagramSocket(8080,InetAddress.getByName("MyThinkPad"));
		byte b[]=new byte[1024];
		String str="java test";
		DatagramPacket packet=new DatagramPacket(b,str.length(),InetAddress.getByName("MyThinkPad"),8080);
		udp.send(packet);
		udp.close();

	}

}
