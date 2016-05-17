package udp.again;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendTalk {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket send=new DatagramSocket();
		byte[] b=new byte[1024];
		DatagramPacket pack=new DatagramPacket(b,b.length,InetAddress.getByName("127.0.0.1"),10002);
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		String str=null;
		while((str=buf.readLine())!=null){
			b=str.getBytes();
			send.send(pack);
			if(str.equals("886"))
				break;
		}
		buf.close();
		send.close();

	}

}
