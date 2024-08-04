package nonblockingio;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class DataConversion {
	public static void main(String[] args) {
		// Create a ByteBuffer with sufficient capacity
		ByteBuffer buffer = ByteBuffer.allocate(1024);

		// Data to be converted
		int intValue = 43;
		float floatValue = 3.14f;
		double doubleValue = 2.71d; 
		String stringValue = "Hello, World!";

		// Convert and store data in ByteBuffer
		buffer.putInt(intValue);
		buffer.putFloat(floatValue);
		buffer.putDouble(doubleValue);

		// Store string data as bytes
		byte[] stringBytes = stringValue.getBytes(StandardCharsets.UTF_8);
		buffer.putInt(stringBytes.length); // Store the length of the string
		buffer.put(stringBytes);

		// Flip the buffer to read the data
		buffer.flip();
		// Read and convert data from ByteBuffer
		int readIntValue = buffer.getInt();
		float readFloatValue = buffer.getFloat();
		double readDoubleValue = buffer.getDouble();

		int stringLength = buffer.getInt(); // Get the length of the stored string
		byte[] readStringBytes = new byte[stringLength];
		buffer.get(readStringBytes); // Read the string bytes

		String readStringValue = new String(readStringBytes, StandardCharsets.UTF_8);

		// Print the converted data
		System.out.println("Integer Value: " + readIntValue);
		System.out.println("Float Value: " + readFloatValue);
		System.out.println("Double Value: " + readDoubleValue);
		System.out.println("String Value: " + readStringValue);
	}
}
