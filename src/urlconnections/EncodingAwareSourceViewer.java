package urlconnections;

import java.io.*;
import java.net.*;

//Download a web page with the correct character set

public class EncodingAwareSourceViewer {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: java EncodingAwareSourceViewer <URL>");
            return;
        }

        for (String urlString : args) {
            try {
                // Set default encoding
                String encoding = "ISO-8859-1";
                URL url = new URL(urlString);
                URLConnection connection = url.openConnection();
                String contentType = connection.getContentType();

                if (contentType != null) {
                    int encodingStart = contentType.indexOf("charset=");
                    if (encodingStart != -1) {
                        encoding = contentType.substring(encodingStart + 8);
                    }
                }

                InputStream inputStream = new BufferedInputStream(connection.getInputStream());
                Reader reader = new InputStreamReader(inputStream, encoding);
                int character;
                while ((character = reader.read()) != -1) {
                    System.out.print((char) character);
                }
                reader.close();
            } catch (MalformedURLException e) {
                System.err.println(urlString + " is not a parseable URL");
            } catch (UnsupportedEncodingException e) {
                System.err.println("Server sent an encoding Java does not support: " + e.getMessage());
            } catch (IOException e) {
                System.err.println("I/O error: " + e.getMessage());
            }
        }
    }
}
