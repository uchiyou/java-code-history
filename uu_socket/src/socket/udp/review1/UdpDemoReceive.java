package socket.udp.review1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpDemoReceive {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//1         建立接受端，
		DatagramSocket receive=new DatagramSocket(10000);
		//2       创建接受数据的包
		byte by[]=new byte[1024];
		DatagramPacket pack=new DatagramPacket(by,0,1024);
		receive.receive(pack);
		String IP=pack.getAddress().getHostAddress();
		int port=pack.getPort();
		//System.out.println(new String(by));
		String text=new String(pack.getData(),0,pack.getLength());
		System.out.println("IP : "+IP+"port : "+port+" content : "+text);
		// console display :  "IP : 127.0.0.1port : 49253 content : this is for udp demo"
		receive.close();

	}

}
