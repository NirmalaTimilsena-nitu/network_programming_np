package urlconnections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadDataFromServerM1 {

   public static void main(String[] args) throws MalformedURLException,IOException  {

      // Establish a connection to the server
      URL url = new URL("https://nirvanacollege.edu.np/");
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();

      // Create an input stream to read the data
      //Either 
      //DataInputStream ds = new DataInputStream(conn.getInputStream()); 
     // BufferedReader reader = new BufferedReader(new InputStreamReader(ds));or
      BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

      // Read the data and print it to the console
      String line;
      while ((line = reader.readLine()) != null) {
         System.out.println(line);
      }

      // Close the connection
      reader.close();
      conn.disconnect();
   }
}

