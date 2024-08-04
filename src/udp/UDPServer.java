package udp;

import java.io.*;
import java.net.*;

//Write UDP client and server socket program in which the server identifies the number sent 
//by a client is either even or odd and replies it accordingly.

public class UDPServer {
	public static void main(String[] args) {
		try {
			DatagramSocket serverSocket = new DatagramSocket(1234);

			byte[] receiveData = new byte[1024];
			byte[] sendData;

			while (true) {
				DatagramPacket receivePacket = new DatagramPacket(receiveData,
						receiveData.length);
				serverSocket.receive(receivePacket);

				String numberStr = new String(receivePacket.getData());
				int number = Integer.parseInt(numberStr.trim());

				String result;
				if (number % 2 == 0) {
					result = "Even";
				} else {
					result = "Odd";
				}

				InetAddress clientAddress = receivePacket.getAddress();
				int clientPort = receivePacket.getPort();
				sendData = result.getBytes();
				DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, 
						clientAddress, clientPort);
				serverSocket.send(sendPacket);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
