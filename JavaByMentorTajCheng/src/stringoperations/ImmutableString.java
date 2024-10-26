package stringoperations;

//On the Existing memory created we cant change anything. if we try to change that change will happen in new memory
public class ImmutableString {
	public static void main(String [] args) {
	/*
	 * when ever java program has to execute it will come on the RAM
	 * In RAM one region will be there on the region we call it as JRE.
	 * 
	 * Where JVM allocate data areas like method area, heap, stack, when ever object terms come into picture
	 * memory allocate in heap area, since string treated as object so it will use heap area.
	 * 
	 * Generally we have normal heap area in that we have string constant pool or string pool
	 * Specialty of scp is duplicates are not promoted.
	 * Specialty of heap area is duplicates allowed.
	 * 
	 * Without using new keyword memory allocate in SCP(String constant pool)
	 * IF we create using new keyword memory allocate in main heap area.
	 * 
	 */

	String a = "Taj";
	String b = new String("Taj");
	// difference is a is using SCP
	//b is using heap area to save memory
	
	
	String c = "Taj";
	String d= "Taj";
	//The difference is for both memory will be in SCP 
	//but it will not create on more object in SCP it refers to C only
	
	String e = new String("Taj");
	String f = new String("Taj");
	// memory allocated in main heap area and 2 new objects will be created
	// duplicated are allowed by using new keyword
	
//----------------------------------------------------------------------------------------------------------------------------------------------	
	
	
	String a1 = "Taj";
	String b1 = "Taj";
	String c1 = new String("Taj");
	System.out.println(a1==b1);  //True
	System.out.println(a1==c1);  //False
	System.out.println(a1.equals(c1)); //true	
	//here a1 a2 are same and c1 is different 
	//because c1 is using new keyword and allocating new memory heap area.
	//a1.equalsc1 is comparing actual values so it is true
	System.out.println("//-----------------------------------------------------------------------------------------------------------------");	
	
	String d1 = new String("Taj");
	String e1 = new String("Taj");
	System.out.println(d1==e1); //false
	//Address is different
	//internally JVm make a copy in SCP which implicit but its not considered
	System.out.println("//-----------------------------------------------------------------------------------------------------------------");	
	
	String g = "Taj";
	String h = "taj";
	String i = new String("Taj");
	System.out.println(g==h);//false
	System.out.println(g==i);//false
	System.out.println(g.equals(i));//true
	System.out.println(g.equalsIgnoreCase(i));//true
	//It ignores casesensitivity of values & both are SCP
	//if doesnt ignore then stores in SCP as diff object
	System.out.println("//-----------------------------------------------------------------------------------------------------------------");	
	
	
	String j = "Taj";
	String k = "Taj";
	String m = "taj";
	String l = new String("Taj");
	System.out.println(j.compareTo(k));
	System.out.println(j.compareTo(l));
	System.out.println(j.compareTo(m));
	//if it returns zero 0 values are same
	
	int res = j.compareTo(k);
	int resu = j.compareTo(l);
	int re = j.compareTo(m);
	if (res ==0 && resu ==0 ) {
		System.out.println("String are equal");
	}
	if (re!=0) {
		System.out.println("String are not equal");
	}else
		System.out.println("");

	
	System.out.println("//-----------------------------------------------------------------------------------------------------------------");	
	
	
	
	String n = "Taj";
	String o = "Cheng";
	System.out.println(n.concat(o));
	System.out.println(n+o);
	System.out.println("//-----------------------------------------------------------------------------------------------------------------");		
	
	// we can do concat with both 
	//concat  and + operator
	
	// In concat we cannot add multiple strings ---->  SLOWER
	// In + operator we can add multiple strings and it is faster than concat
	
	
	String p = "Taj" + "Cheng";
	System.out.println(p);
	
	String q = "Taj" + 23 + 2+1;
	System.out.println(q);
	// if we use first String then it will be considered as string after that
	
	
	String r=  23 + 2+1 +"Taj" ;
	System.out.println(r);
	//if not using string in first then it we do sum and string in last
	
	
	String s=  "23" + 2+1 +"Taj" ;
	System.out.println(s);
	System.out.println("//-----------------------------------------------------------------------------------------------------------------");		
	
	
	
	String j1 = "Taj";
	String k1 = "Cheng";
	String m1 = "Taj" + "Cheng";
	String m2 = "TajCheng";
	String l1 = j1 + "Cheng";
	String n1 = j1 + k1;
	System.out.println(k1);
	System.out.println(m1);
	System.out.println(m1==m2);
	System.out.println(l1);
	System.out.println(n1);
	System.out.println(m1==n1);
	// for m1 memory created in heap area
	//for n1 adding memory allocate in heap area
	// if duplicate not allowed n1 will also refer to m1
	System.out.println("//-----------------------------------------------------------------------------------------------------------------");		
		
	
	
	String TC = "TajCheng";
	String t = " TaCeng ! ";
	System.out.println(TC);
	System.out.println(TC.toLowerCase());
	System.out.println(TC.toUpperCase());
	System.out.println(TC.charAt(1));
	System.out.println(TC.substring(4,8));
	System.out.println(TC.substring(3,5));
	System.out.println(TC.endsWith("g"));
	System.out.println(TC.endsWith(g));//false
	System.out.println(TC.length());
	System.out.println(TC.toString());
	System.out.println(t.length());
	System.out.println(t.trim().getBytes());
	System.out.println(t.length());
	System.out.println("//-----------------------------------------------------------------------------------------------------------------");		
	
	
	ImmutableString a2 = new ImmutableString();
	System.out.println(a2);
	// Reference = A variable which is holding address of an object
	
	
}}	
	
