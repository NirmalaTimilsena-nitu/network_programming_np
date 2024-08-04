package udp;

import java.io.*;
import java.net.*;

//Write UDP client and server socket program in which the server identifies the number sent 
//by a client is either even or odd and replies it accordingly.

public class UDPClient {
	public static void main(String[] args) {
		try {
			DatagramSocket clientSocket = new DatagramSocket();

			InetAddress serverAddress = InetAddress.getByName("localhost");
			int serverPort = 1234;

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter a number: ");
			String numberStr = reader.readLine();
			int number = Integer.parseInt(numberStr);

			byte[] sendData = numberStr.getBytes();
			DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length,
					serverAddress, serverPort);
			clientSocket.send(sendPacket);

			byte[] receiveData = new byte[1024];
			DatagramPacket receivePacket = new DatagramPacket(receiveData,
					receiveData.length);
			clientSocket.receive(receivePacket);

			String result = new String(receivePacket.getData());
			System.out.println("Result from server: " + result.trim());

			clientSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
