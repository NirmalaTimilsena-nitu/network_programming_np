package securesocket;

import javax.net.ssl.*;
import java.io.*;

public class SecureSocketExample {
	public static void main(String[] args) {
		try {
			// Create an SSL socket factory
			SSLSocketFactory socketFactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
			// Create an SSL socket
			SSLSocket socket = (SSLSocket) socketFactory.createSocket("nirvanacollege.edu.np", 443);
			// Get the input/output streams for the socket
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			// Send a request to the server
			out.println("GET / HTTP/1.1");
			out.println("Host:nirvanacollege.edu.np");
			out.println();
			// Read the server's response
			String line;
			while ((line = in.readLine()) != null) {
				System.out.println(line);
			}
			// Close the socket
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
