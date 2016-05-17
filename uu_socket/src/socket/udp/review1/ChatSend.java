package socket.udp.review1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
public class ChatSend {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket send=new DatagramSocket();
		byte[] by=new byte[1024];
		String str=null;
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		while(true){
		str=buf.readLine();
		System.out.println(str);
			by=str.getBytes();
			DatagramPacket pack=new DatagramPacket(by,by.length,InetAddress.getByName("127.0.0.1"),10002);
			send.send(pack);	
			if(str.equals("886")) break;
		}
		send.close();

	}
	/*
	IP : 127.0.0.1 port : 49192 content : haha
	IP : 127.0.0.1 port : 49192 content : xixi
	IP : 127.0.0.1 port : 49192 content : 86xi
      */
}
