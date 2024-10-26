package stringoperations;

import java.util.Arrays;
import java.util.Scanner;

public class Strings {

	//Strings (java.lang.String) are pieces of text stored in your program. Strings are not a primitive data type in Java,
	//however, they are very common in Java programs.
	//In Java, Strings are immutable, meaning that they cannot be changed.
	public static void main(String[] args) {
		//Comparing Strings
		//In order to compare Strings for equality, you should use the String object's equals or equalsIgnoreCase methods.
		//For example, the following snippet will determine if the two instances of String are equal on all characters:
		String firstString = "Test123";
		String secondString = "Test" + 123;
		if (firstString.equals(secondString)) {
		 System.out.println("Both Strings have the same content.");// Both Strings have the same content.
		}

		String firstString1 = "Test123";
		String secondString1 = "TEST123";
		if (firstString1.equalsIgnoreCase(secondString1)) {
			System.out.println("Both Strings are equal, ignoring the case of the individual characters.");
		}
		System.out.println("--------------------------------------------------------------");
		//As of Java 1.7, it is possible to compare a String variable to literals in a switch statement. Make sure that the String
		//is not null, otherwise it will always throw a NullPointerException. Values are compared using String.equals, i.e. case sensitive.

		String stringToSwitch = "A";
		switch (stringToSwitch) {
		 case "a":
		 System.out.println("a");
		 break;
		 case "A":
		 System.out.println("A"); //the code goes here
		 break;
		 case "B":
		 System.out.println("B");
		 break;
		 default:
		 break;
		}
		System.out.println("--------------------------------------------------------------");
		String strObj = new String("Hello!");
		String str = "Hello!";
		// The two string references point two strings that are equal
		if (strObj.equals(str)) {
		 System.out.println("The strings are equal");
		}
		// The two string references do not point to the same object
		if (strObj != str) {
		 System.out.println("The strings are not the same object");
		}
		// If we intern a string that is equal to a given literal, the result is
		// a string that has the same reference as the literal.
		String internedStr = strObj.intern();
		if (internedStr == str) {
		 System.out.println("The interned string and the literal are the same object");
		}
		System.out.println("--------------------------------------------------------------");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = scanner.next();
		char[] a = s.toCharArray();
		System.out.println("Enter the character you are looking for");
		System.out.println(s);
		String c = scanner.next();
		char d = c.charAt(0);
		for (int i = 0; i <= s.length(); i++) {
		 if (a[i] == d) {
		 if (d >= 'a' && d <= 'z') {
		 d -= 32;
		 } else if (d >= 'A' && d <= 'Z') {
			 d += 32;
			 }
			 a[i] = d;
			 break;
			 }
			}
			s = String.valueOf(a);
			System.out.println(s);
			System.out.println("--------------------------------------------------------------");
			///--------------------------------------------------------------///--------------------------------------------------------------	
			//To find the exact position where a String starts within another String, use String.indexOf():
			String s1 = "this is a long sentence";
			int i = s1.indexOf('i'); // the first 'i' in String is at index 2
			int j = s1.indexOf("long"); // the index of the first occurrence of "long" in s is 10
			int k = s1.indexOf('z'); // k is -1 because 'z' was not found in String s
			int h = s1.indexOf("LoNg"); // h is -1 because "LoNg" was not found in String s
			System.out.println(i);System.out.println(j);System.out.println(k);System.out.println(h);
			System.out.println("--------------------------------------------------------------");
			String a1 = "alpha";
			 String b = "alpha";
			 String c1 = new String("alpha");
			 //All three strings are equivalent
			 System.out.println(a1.equals(b) && b.equals(c1));
			 //Although only a and b reference the same heap object
			 System.out.println(a1 == b);
			 System.out.println(a1 != c1);
			 System.out.println(b != c1);
			 System.out.println(a1 == c1);
			 System.out.println(b == c1);
			 System.out.println("--------------------------------------------------------------");			 
			 
			 String lineFromCsvFile = "Mickey;Bolton;12345;121216";
			 String[] dataCells = lineFromCsvFile.split(";");
			 // Result is dataCells = { "Mickey", "Bolton", "12345", "121216"};
			 for (String cell : dataCells) {
		            System.out.println(cell);
			 }
			 System.out.println("--------------------------------------------------------------");				 
			 String[] firstNames = "Mickey, Frank, Alicia, Tom".split(", ");
			 String result = Arrays.toString(dataCells)
                     .replace("[", "{")
                     .replace("]", "}")
                     .replace(", ", "\", \"");
 
 // Adding quotes around each element
 result = result.replaceFirst("\\{", "\\{\"").replaceFirst("\\}$", "\"\\}");
 System.out.println(result);
 
			 for (String cel : firstNames) {
		            System.out.println(cel);
			 }
			 
			 
			 
			 
			 
			 
			 
			 
	}

}
