package fileHandling;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;
import java.util.concurrent.*;

public class About6Async {
    public static void main(String[] args) {
        Path path = Paths.get("example.txt");

        // Writing to a file asynchronously
        try (AsynchronousFileChannel asyncFileChannel = AsynchronousFileChannel.open(path, StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {
            ByteBuffer buffer = ByteBuffer.allocate(64);
            buffer.put("Hello, AsyncFileChannel!".getBytes());
            buffer.flip();

            Future<Integer> writeFuture = asyncFileChannel.write(buffer, 0);
            while (!writeFuture.isDone()) {
                System.out.println("Writing...");
            }
            System.out.println("Write successful.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading from a file asynchronously
        try (AsynchronousFileChannel asyncFileChannel = AsynchronousFileChannel.open(path, StandardOpenOption.READ)) {
            ByteBuffer buffer = ByteBuffer.allocate(64);
            Future<Integer> readFuture = asyncFileChannel.read(buffer, 0);
            while (!readFuture.isDone()) {
                System.out.println("Reading...");
            }
            buffer.flip();
            while (buffer.hasRemaining()) {
                System.out.print((char) buffer.get());
            }
            System.out.println("\nRead successful.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
