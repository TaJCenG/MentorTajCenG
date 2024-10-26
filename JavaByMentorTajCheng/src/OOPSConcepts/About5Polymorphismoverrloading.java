package OOPSConcepts;

class Polymorph {
	 public int add(int a, int b){
	 return a + b;
	 }
	 
	 public int add(int a, int b, int c){
	 return a + b + c;
	 }
	 public float add(float a, float b){
	 return a + b;
	 }
	 
	}

public class About5Polymorphismoverrloading {

	//Method overloading, also known as function overloading, is the ability of a class to have multiple methods with
	//the same name, granted that they differ in either number or type of arguments.

	//Compiler checks method signature for method overloading.
	//Method signature consists of three things -
	//1. Method name
	//2. Number of parameters
	//3. Types of parameters
	//If these three are same for any two methods in a class, then compiler throws duplicate method error.
	//This type of polymorphism is called static or compile time polymorphism because the appropriate method to be
	//called is decided by the compiler during the compile time based on the argument list
	public static void main(String... args){
		 Polymorph poly = new Polymorph();
		 int a = 1, b = 2, c = 3;
		 float d = (float) 1.5, e = (float) 2.5;
		 System.out.println(poly.add(a, b));
		 System.out.println(poly.add(a, b, c));
		 System.out.println(poly.add(d, e));
		 }
	
	
}
