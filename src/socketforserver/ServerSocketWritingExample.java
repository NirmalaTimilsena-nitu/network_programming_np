package socketforserver;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ServerSocketWritingExample {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("localhost",6666);
		DataOutputStream ds = new DataOutputStream(socket.getOutputStream());
	      ds.writeUTF("Hello Server");
	      ds.flush();
	      ds.close();
	      socket.close();
	}

}
