package ExceptionHandling;

import java.util.Scanner;

public class Exception {

	//An exception is an unexpected event that occurs during program execution, disrupting the normal flow of control.
	//It can be caused by various reasons, such as invalid input, resource exhaustion, or network errors.
	public static void main(String[] args) {
		
		int a, b, result;
		 Scanner input = new Scanner(System.in);
		 System.out.println("Input two integers");
		 a = input.nextInt();
		 b = input.nextInt();
		 result = a / b;
		 System.out.println("Result = " + result);
		 }
	}
//Now we compile and execute the above code, and see the output for an attempted division by zero:
//Input two integers
//7 0
//Exception in thread "main" java.lang.ArithmeticException: / by zero at Division.main(Disivion.java:14)

//Handling
//It is a mechanism to handle runtime errors such as classNotFound, IO, SQL etc
//Error
//Our code is not responsible to raise error (non-recoverable)
//Cause due to lack of system resources (Memory problem, hardware problem)
	//Example: OutOfMemoryError, StackOverflowError
