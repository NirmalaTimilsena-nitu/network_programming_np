package internetaddresses;

import java.net.InetAddress;
import java.net.UnknownHostException;

//Are www.ibiblio.org and helios.ibiblio.org the same?
public class ComapreTwoWebsites {
	public static void main(String[] args) throws UnknownHostException {
		
	
	InetAddress address = InetAddress.getByName("nirvanacollege.edu.np");
	InetAddress addr = InetAddress.getByName("apexcollege.edu.np");
	if(address.equals(addr)) {
		System.out.println("nirvana = apex");
	}else {
		System.out.println("nirvana != apex");
	}
	}

}
