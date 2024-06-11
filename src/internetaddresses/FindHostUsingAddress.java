package internetaddresses;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class FindHostUsingAddress {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress address = InetAddress.getByName("154.26.134.246");
		System.out.println(address.getCanonicalHostName());
		
	}
	
//	    public static void main(String[] args) {
//	        String ipAddress = "110.44.121.125";
//
//	        try {
//	            InetAddress inetAddress = InetAddress.getByName(ipAddress);
//	            String hostname = inetAddress.getHostName();
//	            System.out.println("IP Address: " + ipAddress);
//	            System.out.println("Hostname: " + hostname);
//	        } catch (UnknownHostException e) {
//	            e.printStackTrace();
//	        }
//	    }
	}


