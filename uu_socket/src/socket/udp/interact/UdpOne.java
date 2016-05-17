package socket.udp.interact;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UdpOne {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket NO1=new DatagramSocket(5555);
		byte[]by=new byte[1024];
		String str=null;
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		while((str=buf.readLine())!=null)
		{
			by=str.getBytes();
			DatagramPacket pack=new DatagramPacket(by,str.length()/*by.length*/,InetAddress.getByName("127.0.0.1"),7777);
			NO1.send(pack);
			if(str.equals("886")) break;
		}

	}

}
