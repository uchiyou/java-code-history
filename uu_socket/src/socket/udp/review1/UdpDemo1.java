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
		//1                  建立UDPsocket服务，使用DatagramSocket对象
		DatagramSocket send=new DatagramSocket();
		//2            将要发送的数据封装到数据包中
		String str="this is for udp demo";
		//使用DatagramPacket将数据封装到该数据包中
		byte by[]=str.getBytes();
		DatagramPacket pack=new DatagramPacket(by,by.length,InetAddress.getByName("127.0.0.1"),10000);
		//
		send.send(pack);
		send.close();

	}

}
