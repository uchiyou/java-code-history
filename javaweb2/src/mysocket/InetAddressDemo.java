package mysocket;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {

	/**
	 * @param args
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress ip=InetAddress.getByName("developer.android.com");
		System.out.println(ip.getHostAddress()+"....."+ip.getHostName());

	}

}
