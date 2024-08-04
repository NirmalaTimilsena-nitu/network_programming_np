package socketforserver;

import java.net.*;
import java.io.*;

public class ClientReadWriteExample {
    public static void main(String args[]) throws UnknownHostException, IOException  {
        Socket s = new Socket("localhost",888);
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "  ", str2 = " ";
        System.out.println("Say hello to the server");
        while (!str.equals("stop")) {

            str = br.readLine();
            dout.writeUTF(str);
            dout.flush();
            str2 = din.readUTF();
            System.out.println("Server says: " + str2);
        }

        dout.close();
        s.close();
    }
}

