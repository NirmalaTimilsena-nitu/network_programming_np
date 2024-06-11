package internetaddresses;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddressValidator {
	public static int getVersion(InetAddress ia) {
		byte[] address = ia.getAddress();
		if (address.length == 4)
			return 4;
		else if (address.length == 16)
			return 6;
		else
			return -1;
	}

	public static void main(String[] args) {
		try {
			InetAddress ia = InetAddress.getLocalHost();
			int version = IPAddressValidator.getVersion(ia);
			System.out.println("IP Address Version: " + version);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
//package internetaddresses;
//
//import java.net.InetAddress;
//import java.net.UnknownHostException;
//
//public class IPAddressValidator {
//
//    public static String getIPAddressType(String ipAddress) {
//        try {
//            InetAddress address = InetAddress.getByName(ipAddress);
//            if (address.getHostAddress().equalsIgnoreCase(ipAddress)) {
//                if (address instanceof java.net.Inet4Address) {
//                    return "IPv4";
//                } else if (address instanceof java.net.Inet6Address) {
//                    return "IPv6";
//                }
//            }
//        } catch (UnknownHostException e) {
//            return "Invalid IP address";
//        }
//        return "Invalid IP address";
//    }
//
//    public static void main(String[] args) {
//        String[] testIPs = {
//                "192.168.1.1", // IPv4
//                "255.255.255.255", // IPv4
//                "0:0:0:0:0:ffff:c0a8:101", // IPv6
//                "2001:0db8:85a3:0000:0000:8a2e:0370:7334", // IPv6
//                "invalidIP" // Invalid
//        };
//
//        for (String ip : testIPs) {
//            System.out.println(ip + " is " + getIPAddressType(ip));
//        }
//    }
//}
//
