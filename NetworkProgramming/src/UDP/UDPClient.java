package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
//import java.net.SocketException;

public class UDPClient {
	
	public static void main(String[] args) throws IOException {
		DatagramSocket client = new DatagramSocket();
		InetAddress ipAddress = InetAddress.getLocalHost();
		String str = "Hello World";
		byte[] buf = str.getBytes();
		
		DatagramPacket pac = new DatagramPacket(buf, buf.length, ipAddress, 4222);
		client.send(pac);
		client.close();
	}

}
