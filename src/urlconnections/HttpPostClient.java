package urlconnections;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpPostClient {

	public static void main(String[] args) {
		String serverUrl = "https://www.google.com/";
		String dataToSend = "Hello, Server!";

		HttpURLConnection urlConnection = null;

		try {
			URL url = new URL(serverUrl);
			urlConnection = (HttpURLConnection) url.openConnection();
			urlConnection.setRequestMethod("POST");
			urlConnection.setDoOutput(true);
			// 5. Create an OutputStream to send data to the server
			OutputStream outputStream = urlConnection.getOutputStream();
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
			// 6. Write the data to the OutputStream
			writer.write(dataToSend);
			// 7. Flush and close the writer
			writer.flush();
			writer.close();
			outputStream.close();
			// 8. Get the response code (optional)
			int responseCode = urlConnection.getResponseCode();
			System.out.println("Response Code: " + responseCode);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (urlConnection != null) {
				// 9. Disconnect the connection
				urlConnection.disconnect();
			}
		}
	}
}
