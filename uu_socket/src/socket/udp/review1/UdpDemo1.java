package socket.udp.review1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UdpDemo1 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//1                  ����UDPsocket����ʹ��DatagramSocket����
		DatagramSocket send=new DatagramSocket();
		//2            ��Ҫ���͵����ݷ�װ�����ݰ���
		String str="this is for udp demo";
		//ʹ��DatagramPacket�����ݷ�װ�������ݰ���
		byte by[]=str.getBytes();
		DatagramPacket pack=new DatagramPacket(by,by.length,InetAddress.getByName("127.0.0.1"),10000);
		//
		send.send(pack);
		send.close();

	}

}
