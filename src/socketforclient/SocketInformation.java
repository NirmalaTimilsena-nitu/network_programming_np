package socketforclient;

import java.net.*;
import java.io.*;
public class SocketInformation {
    public static void main(String[] args) {
      	String host = "nirvanacollege.edu.np";
            try {
                Socket socket = new Socket(host,80);
                System.out.println("Connected to " + socket.getInetAddress() 
                + " on port " + socket.getPort() + " from port " 
                		+ socket.getLocalPort() 
                + " of " + socket.getLocalAddress());
            } catch (UnknownHostException ex) {
                System.err.println("I can't find " + host);
            } catch (SocketException ex) {
                System.err.println("Could not connect to " + host);
            } catch (IOException ex) {
                System.err.println(ex);
            }
        
    }
}     
