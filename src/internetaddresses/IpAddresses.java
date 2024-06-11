package internetaddresses;

import java.net.InetAddress;
import java.net.UnknownHostException;


	public class IpAddresses {
	    public static void main(String[] args) {
	        if (args.length != 1) {
	            System.out.println("Usage: java IPCharacteristics <IP address or hostname>");
	            return;
	        }

	        String input = args[0];

	        try {
	            InetAddress address = InetAddress.getByName(input);
	            String canonicalHostName = address.getCanonicalHostName();
	            String hostAddress = address.getHostAddress();

	            String outputPrefix = (canonicalHostName.equals(hostAddress) ? "" : canonicalHostName + "/") + hostAddress;

	            if (address.isAnyLocalAddress()) {
	                System.out.println(outputPrefix + " is a global address.");
	            }
//	            } else if (address.isLoopbackAddress()) {
//	                System.out.println(outputPrefix + " is loopback address.");
//	            } else if (address.isLinkLocalAddress()) {
//	                System.out.println(outputPrefix + " is a link-local address.");
//	            } else if (address.isSiteLocalAddress()) {
//	                System.out.println(outputPrefix + " is a site-local address.");
//	            } else if (address.isMulticastAddress()) {
//	                if (address.isMCGlobal()) {
//	                    System.out.println(outputPrefix + " is a global multicast address.");
//	                } else if (address.isMCNodeLocal()) {
//	                    System.out.println(outputPrefix + " is a node-local multicast address.");
//	                } else if (address.isMCLinkLocal()) {
//	                    System.out.println(outputPrefix + " is a link-local multicast address.");
//	                } else if (address.isMCSiteLocal()) {
//	                    System.out.println(outputPrefix + " is a site-local multicast address.");
//	                } else if (address.isMCOrgLocal()) {
//	                    System.out.println(outputPrefix + " is an organization-local multicast address.");
//	                }
//	            } 
	            else {
	                System.out.println(outputPrefix + " is a global address.");
	            }

//	            if (!address.isMulticastAddress()) {
//	                System.out.println(outputPrefix + " is a unicast address.");
//	            }

	        } catch (UnknownHostException e) {
	            System.out.println("Invalid IP address or hostname: " + input);
	        }
	    }
	}

