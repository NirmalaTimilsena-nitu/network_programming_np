package urlconnections;


//Print the entire HTTP header
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class GetAllHeaderField {
	public static void main(String[] args) {
		try {
			String resource = "https://nimscollege.edu.np/";
			URL url = new URL(resource);
			URLConnection uc = url.openConnection();
			for (int j = 1;; j++) {
				String header = uc.getHeaderField(j);
				if (header == null)
					break;
				System.out.println(uc.getHeaderFieldKey(j) + ":" + header);
			}
		} catch (MalformedURLException ex) {
			System.err.println("Url is not Understand");
		} catch (IOException ex) {
			System.err.println(ex);
		}
		System.out.println();
	}
}
