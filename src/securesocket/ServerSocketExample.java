package securesocket;

import java.net.ServerSocket;
import java.net.Socket;

import javax.net.ssl.SSLServerSocketFactory;

public class ServerSocketExample {
	public static void main(String[] args) {
		try {
			SSLServerSocketFactory factory = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
			ServerSocket ss = factory.createServerSocket( );
			Socket s = ss.accept();
			System.out.println(s + "Client Accepted and Connected......");
			s.close();
		} catch (Exception e) {
		}
	}

}
