package internetaddresses;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

//A program that lists all the network interfaces
public class NetworkInterfaceLister {
	public static void main(String[] args) throws SocketException {
		Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
		//An object that implements the Enumeration interface generates aseries of elements, one at a time.
		//Successive calls to the nextElement method return successive elements of theseries. 
		while (interfaces.hasMoreElements()) {
			NetworkInterface ni = interfaces.nextElement();
			System.out.println(ni);
		}

	}
}
     