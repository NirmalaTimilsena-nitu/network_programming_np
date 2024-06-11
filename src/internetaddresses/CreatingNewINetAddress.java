package internetaddresses;

//A program that prints the address of nirvanacollege by getByName Method
import java.net.InetAddress;
import java.net.UnknownHostException;

public class CreatingNewINetAddress {
//	java.net.InetAddress class is Java’s high-level representation of an 
//	IP address,both IPv4 and IPv6.
	public static void main(String[] args) {
		try {
			InetAddress address = InetAddress.getByName("viswaniketan.edu.np");
			System.out.println(address);

		} catch (UnknownHostException ex) {
			System.out.println("Could not find host name");
		}
//		try {
//			InetAddress[] addresses = InetAddress.getAllByName("www.oreilly.com");
//			for (InetAddress address : addresses) {
//			System.out.println(address);
//			}
//			} catch (UnknownHostException ex) {
//			System.out.println("Could not find www.oreilly.com");
//			}

	}

}
