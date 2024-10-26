package stringoperations;

class ImutableString{
	
	// 3-ways to create
	String a = "Taj";
	String b = new String("Taj");
	char[] c = {'a','b','c'};
	
	//   If we try to change the object that change would not happen in the same memory
	//   the changes will happen in the new memory is called  IMMUTABLE STRING
}
public class StringsPart2 {

	public static void main(String[] args) {
		//Substrings
		String s = "this is an example";
		String a = s.substring(11); // a will hold the string starting at character 11 until the end("example")
		String e = s.substring(5, 10); // b will hold the string starting at character 5 and ending rightbefore character 10 ("is an")
		System.out.println(a);
		System.out.println(e);
		System.out.println("-----------------------------Substrings---------------------------------");
		//Substrings may also be applied to slice and add/replace character into its original String. For instance, you faced a
		//Chinese date containing Chinese characters but you want to store it as a well format Date String.
		
		String datestring = "2015年11月17日";
		datestring = datestring.substring(0, 4) + "-" + datestring.substring(5,7) + "-" +
		datestring.substring(8,10);
		System.out.println(datestring);
		System.out.println("------------------------Reversing Strings-------------------------------");		
		//Reversing Strings
		
		String code = "code";
		System.out.println(code);
		 StringBuilder sb = new StringBuilder(code);
		 code = sb.reverse().toString();
		System.out.println(code);
		
		System.out.println("----------------------- Remove Whitespace ---------------------");		
		//Remove Whitespace from the Beginning andEnd of a String
		//The trim() method returns a new String with the leading and trailing whitespace removed.
		String s1 = new String(" Hello World!! ");
		String t = s1.trim(); // t = "Hello World!!"
		System.out.println(t);
		
		System.out.println("----------------------- Replacing parts of Strings ---------------------");	
		String s11 = "popcorn";
		System.out.println(s11.replace('p','W'));
		String z = "metal petal et al.";
		System.out.println(z.replace("etal","etallica"));
		String x = "spiral metal petal et al.";
		System.out.println(x.replaceAll("(\\w*etal)","$1lica"));
//		String replaceFirst(String regex, String replacement)
//		Replaces the first substring of this string that matches the given regular expression with the given replacement
		String y = "spiral metal petal et al.";
		System.out.println(y.replaceAll("(\\w*etal)","$1lica"));
		
		
		
		
		
		
		
	}

}
