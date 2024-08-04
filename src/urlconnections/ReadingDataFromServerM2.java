package urlconnections;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ReadingDataFromServerM2 {
	public static void main(String[] args) throws MalformedURLException,IOException {
		URL url = new URL("https://www.google.com/");
		URLConnection conn = url.openConnection();
		InputStream is = conn. getInputStream();
		int Line;
		while((Line= is.read())!= -1) {
			System.out.println((char) Line);
		}
	}
 
}
