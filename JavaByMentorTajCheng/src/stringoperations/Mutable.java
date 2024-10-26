package stringoperations;

public class Mutable {
	public static void main(String [] args) {
		
		/*
		 * in string buffer we dont have concat :: we use append
		 * 
		 * String Buffer is mutable, if we try to change the object that change would happen in the same memory
		 * Immutable variable  :: not
		 * immutable object :: valid
		 */
		
		StringBuffer sb = new StringBuffer("Taj");  //(SCP  & HEAP)
		sb.append("Cheng");
		System.out.println(sb); // change happen in same memory
		
		String a = new String("Taj");
		String b = new String("Taj");
		System.out.println(a.equals(b));  // Checking 2 objects 
		// equals method is implemented to check the content of string
		System.out.println("IMMUTABLE ------VSVSVSVSVSVSVSVSVSVSVSVSVSVSVSVSVSVSVSVSVSVSVSVSVS  ----MUTABLE");			
		
		StringBuffer c = new StringBuffer("Taj");
		StringBuffer d = new StringBuffer("Taj");
		System.out.println(c.equals(d));  // compares the reference
		//equals method is not available in StringBuffer class 
		//it is part of object class :: which compares the reference not the data
		
		System.out.println("I---------------------------");		
		/*
		 * It is an access modifier which can be applied at 3-levels
		 * a.variable  b.classLevel  c.MethodLevel
		 * 
		 * Final variable  :: valid
		 * final object  :: not
		 * Immutable variable  :: not
		 * immutable object :: valid
		 */
		
		final int e = 10;
		int f = 3;
		//e++;
		f++;
		//If the variable if of primitive type and if it is final then value of the variable should not be changed
		//If we try to change it would result in "CompileTimeError"
		
		
		
		System.out.println("FINAL   VS    IMMUTABILITY");		
		final StringBuffer g = new StringBuffer("Taj");
	     g.append("Cheng");
	     System.out.println(g);
	     
//	     g = new StringBuffer("TajCheng");
//	     System.out.println(g);		
	/*
	 *  If the variable is of reference type and if it is of mutable nature then as per its mutable nature the object data can be changed
	 *  it would not result in CE. but if we try to reassign the reference variable with a new object address then it would result in CE	
	 */
		
	     System.out.println("---------------------------");			
		
	/*
	 * primitive  ::  int  float  byte  short  long  double
	 * 
	 * reference ::  String  StringBuffer  StringBuilder  Object	
	 * 
	 * StringBuffer   :: available in java.lang.package
	 * 
	 * default capacity is 16
	 * 
	 * Imp method of string buffer  
	 * ==========================
	 * length() -> it counts the noof characters present in StringBuffer Object
	 * append(boolean) -> it appends the given data to the old StringBuffer object
	 */
		
		StringBuffer h = new StringBuffer();
		System.out.println(h.capacity()); //default is 16
		h.append("abcdefg");
		System.out.println(h.capacity());//16
		h.append("q");
		System.out.println(h.capacity());
		
		System.out.println("---------------------------");				
		
	/*
	 * if the capacity is filled internally JVM will increase the size 	
	 * formula  (currentcapacity+1)*2
	 */
		
	StringBuffer i = new StringBuffer(19);  // here integer not specifies the capacity of StringBuffer
	System.out.println(i.capacity());
	
	StringBuffer j = new StringBuffer("Taju");
	System.out.println(j.capacity()); //here the capacity will be length of string + 16
	System.out.println(j.length());
		
		
	System.out.println("---------------------------------------------------------------------------------");		
		
		
		StringBuffer k = new StringBuffer("Taj");
		k.insert(2, "Abc");  //insert the value from 2 position
		System.out.println(k);
		System.out.println("---------------------------------------------------------------------------------");		
		
StringBuffer l = new StringBuffer("TajCengJavaNotes");
System.out.println(l.capacity());
System.out.println(l.length());

l.delete(11, 16);
System.out.println(l);

l.deleteCharAt(8);
System.out.println(l);

l.reverse();
System.out.println(l);
		
l.setLength(3);
System.out.println(l);
		
System.out.println("---------------------------------------------------------------------------------");		
		
StringBuffer m = new StringBuffer(100);
System.out.println(m.capacity());
m.append("Taj");
System.out.println(m.capacity());
m.trimToSize();                        //change capacity to length of string
System.out.println(m.capacity());

m.ensureCapacity(5);             // increase the capacity to the specific limit
System.out.println(m.capacity());

/*
 * Difference B/W  StringBuilder and String Buffer
 * 
 * StringBuffer
 * ============
 * 1. all methods present are synchronized
 * 2. at a time on StrBuff object one thread can operate
 * 3. since only one thread operate it is thread safety
 * 4. performance is low
 * 
 * 
 * StringBuilder
 * ============
 * 1.not synchronized
 * 2.at a time many threads can operate
 * 3. not thread safety
 * 4.performance is high
 * 
 * 
 * 
 * 
 */





























	}
	
	
}
