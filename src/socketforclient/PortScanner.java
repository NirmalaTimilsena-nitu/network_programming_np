package socketforclient;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class PortScanner {
	public static void main(String[] args) {
		try {
			InetAddress ia = InetAddress.getLocalHost();
			String hostname = ia.getHostName();
			for (int port = 1; port < 65536; port++) {
				try (Socket socket = new Socket(hostname, port)) {
					System.out.println("A Server is listening on Port "
				+ port + " of " + hostname);
				} catch (IOException e) {
					
				}
			}
		} catch (UnknownHostException e) {
			System.err.println("Unknown host exception: " + e.getMessage());
		} catch (IOException e) {
			System.err.println("IOException: " + e.getMessage());
		}
	}
}
