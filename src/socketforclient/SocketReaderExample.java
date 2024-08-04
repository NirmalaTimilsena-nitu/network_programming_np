package socketforclient;

import java.io.*;

import java.net.Socket;

public class SocketReaderExample {
    public static void main(String[] args) {
        String serverAddress = "time.nist.gov"; // Replace with the server's IP address
        int serverPort = 13; // Replace with the server's port number

        try {
            Socket socket = new Socket(serverAddress, serverPort);
            socket.setSoTimeout(15000);
            // Open an input stream to read data from the server
            BufferedReader reader = new BufferedReader(new InputStreamReader
            		(socket.getInputStream()));

            // Read data from the server
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Received: " + line);
            }

            // Close the socket and input stream
            reader.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

