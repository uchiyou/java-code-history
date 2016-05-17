package udp.again;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Send {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket send=new DatagramSocket();
	//	String str="this is the test ";
		BufferedReader buf=new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
		String str=null;
		 DatagramPacket pack=null;
		while(( str=buf.readLine())!=null){
	//    DatagramPacket pack=new DatagramPacket(str.getBytes(),str.length(),InetAddress.getByName("127.0.0.1"),10001);
		pack=	new DatagramPacket(str.getBytes(),str.length(),InetAddress.getByName("127.0.0.1"),10001);
	    send.send(pack);
	    if(str.equals("886"))
	    	break;
	    
		}
	    send.close();

	}

}
