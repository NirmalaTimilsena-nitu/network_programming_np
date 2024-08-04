package socketforclient;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class SocketWriterExample {
    public static void main(String[] args) {
        String serverAddress = "dict.org";
        int serverPort = 2628;

        try {
            Socket socket = new Socket(serverAddress, serverPort);
            socket.setSoTimeout(15000);
            // Open an output stream to write data to the server
            OutputStream outputStream = socket.getOutputStream();

            // Write data to the server
            String data = "Hello, server!";
            outputStream.write(data.getBytes());
            outputStream.flush();

            // Close the socket and output stream
            outputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

