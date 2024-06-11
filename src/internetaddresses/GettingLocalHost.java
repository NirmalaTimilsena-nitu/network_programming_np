package internetaddresses;
//Find the address of the local machine
import java.net.InetAddress;
import java.net.UnknownHostException;

public class GettingLocalHost {
	public static void main(String[] args)  {
		InetAddress address;
		try {
			address = InetAddress.getLocalHost();
			System.out.println(address);
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		}
		
			}
}

//NirmalaTimilsena/192.168.1.2