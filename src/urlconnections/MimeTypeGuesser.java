package urlconnections;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class MimeTypeGuesser {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java MimeTypeGuesser <file-path>");
            return;
        }

        Path filePath = Paths.get(args[0]);
        try {
            String mimeType = Files.probeContentType(filePath);
            if (mimeType == null) {
                System.out.println("MIME type could not be determined.");
            } else {
                System.out.println("MIME type: " + mimeType);
            }
        } catch (IOException e) {
            System.err.println("Error occurred while determining MIME type: " + e.getMessage());
        }
    }
}

