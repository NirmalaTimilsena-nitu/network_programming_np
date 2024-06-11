package internetaddresses;


//Find the IP address of the local machine
import java.net.InetAddress;
import java.net.UnknownHostException;

public class FindLocalAddress {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress address = InetAddress.getLocalHost();
		String dotqad = address.getHostAddress();
		System.out.println("My Machine address "+ dotqad);
	}

}
