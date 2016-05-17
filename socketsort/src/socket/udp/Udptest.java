package socket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Udptest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket no1=new DatagramSocket();
		byte by[]="test".getBytes();
		DatagramPacket pack=new DatagramPacket(by,by.length,10000);
		no1.send(pack);
		no1.close();
		

	}

}
