package urlconnections;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class WritingToTheServer {

    public static void main(String[] args) {
        String serverAddress = "192.168.1.6";  // Server address
        int port = 12345;  // Server port number

        Socket socket = null;
        PrintWriter out = null;

        try {
            // 1. Create a socket to connect to the server
            socket = new Socket(serverAddress, port);

            // 2. Create an output stream to send data to the server
            OutputStream outputStream = socket.getOutputStream();
            out = new PrintWriter(outputStream, true);

            // 3. Send data to the server
            String dataToSend = "Hello, Server!";
            out.println(dataToSend);

            System.out.println("Data sent to the server: " + dataToSend);
        } catch (UnknownHostException e) {
            System.err.println("Don't know about host: " + serverAddress);
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to: " + serverAddress);
            e.printStackTrace();
        } finally {
            // 4. Close resources
            try {
                if (out != null) {
                    out.close();
                }
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

