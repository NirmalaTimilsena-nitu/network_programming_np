package urlconnections;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class WriteDataToServer {
    public static void main(String[] args) throws IOException{
    
            // Establish a connection to the server
            URL url = new URL("https://viswaniketan.edu.np");  
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            // Set the request method to POST
            conn.setRequestMethod("POST");
            // Enable output for the connection
            conn.setDoOutput(true);
            // Create an OutputStream to send data to the server
            OutputStream outputStream = conn.getOutputStream();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
            // Data to be sent to the server
            String dataToSend = "Hello, Server!";
            // Write the data to the OutputStream
            writer.write(dataToSend);
            // Flush and close the writer
            writer.flush();
            writer.close();
            outputStream.close();
            // Get the response code (optional)
            int responseCode = conn.getResponseCode();
            System.out.println("Response Code: " + responseCode);
            // Disconnect the connection
            conn.disconnect();
   
    }
}

