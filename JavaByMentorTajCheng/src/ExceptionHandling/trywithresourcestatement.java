package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class trywithresourcestatement {

	public static void main(String[] args) throws FileNotFoundException {
//		try (PrintStream stream = new PrintStream("hello.txt")) {
//			 stream.println("Hello world!");
//			} catch (FileNotFoundException ex) {
//			 System.err.println("Cannot open the file");
//
//	}finally {
//		 System.err.println("All done");
//	}

		// Note that the constructor is not part of the try-catch statement
		PrintStream stream = new PrintStream("hello.txt");
		// This variable is used to keep track of the primary exception thrown
		// in the try statement. If an exception is thrown in the try block,
		// any exception thrown by AutoCloseable.close() will be suppressed.
		Throwable primaryException = null;
		try {
			stream.println("Hello world!");
		} catch (Throwable t) {
		 // If an exception is thrown, remember it for the finally block
		 primaryException = t;
		 throw t;
		} finally {
		 if (primaryException == null) {
		 // If no exception was thrown so far, exceptions thrown in close() will
		 // not be caught and therefore be passed on to the enclosing code.
		 stream.close();
		 } else {
		 // If an exception has already been thrown, any exception thrown in
		 // close() will be suppressed as it is likely to be related to the
		 // previous exception. The suppressed exception can be retrieved
		 // using primaryException.getSuppressed().
		 try {
		 stream.close();
		 } catch (Throwable suppressedException) {
		 primaryException.addSuppressed(suppressedException);
		 }
		 }
		}
}}
