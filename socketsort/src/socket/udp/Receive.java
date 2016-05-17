package socket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receive {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket receive=new DatagramSocket(10000);
		byte[] by=new byte[1024];
		DatagramPacket pack=new DatagramPacket(by,by.length);
		receive.receive(pack);
		System.out.println(pack.getData().toString());
		receive.close();

	}

}
