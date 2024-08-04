package nonblockingio;

import java.nio.ByteBuffer;

public class BufferOperations {
	public static void main(String[] args) {
		// Filling Buffer: Put data into the buffer
		ByteBuffer buffer = ByteBuffer.allocate(24267);
		System.out.println("Initial buffer: " + buffer);

		for (int i = 0; i < buffer.capacity(); i++) {
			buffer.put((byte) (i + 1));
		}
		System.out.println("Buffer after filling: " + buffer);

		// Flipping the buffer for draining
		buffer.flip();
		System.out.println("Buffer after flip: " + buffer);

		// Draining Buffer: Read data from the buffer
		while (buffer.hasRemaining()) {
			System.out.print(buffer.get() + " ");
		}
		System.out.println("\nBuffer after draining: " + buffer);

		// Duplicating Buffer
		buffer.rewind(); // Rewind to read again from the start
		ByteBuffer duplicateBuffer = buffer.duplicate();
		System.out.println("Duplicate buffer: " + duplicateBuffer);

		// Slicing Buffer
		buffer.position(1);
		buffer.limit(5);
		ByteBuffer slicedBuffer = buffer.slice();
		System.out.println("Sliced buffer: " + slicedBuffer);

		// Compacting Buffer
		buffer.position(5);
		buffer.compact();
		System.out.println("Buffer after compacting: " + buffer);
	}
}
