package OOPSConcepts;

class BaseClass {
	 public void baseMethod(){
	 System.out.println("Doing base class stuff");
	 }
	}
	 class SubClass extends BaseClass {
	}
//-----------------------------------------------------------------------------------------------------------------------------------------	 
	 //Additional content can be added to a subclass. Doing so allows for additional functionality in the subclass without
	 //any change to the base class or any other subclasses from that same base class:
	  class Subclass2 extends BaseClass {
		 public void anotherMethod() {
		 System.out.println("Doing subclass2 stuff");
		 }
		}
//-----------------------------------------------------------------------------------------------------------------------------------------	 	
	  //Fields are also inherited:
	  //private fields and methods still exist within the subclass, but are not accessible:
	  class BaseClassWithField {
		  public int x;
		 }
	  class SubClassWithField extends BaseClassWithField {
		  public SubClassWithField(int x) {
		  this.x = x; //Can access fields
		  }
		 }
	  class BaseClassWithPrivateField {
		  private int x = 5;
		  public int getX() {
		  return x;
		  }
		 }
	  class SubClassInheritsPrivateField extends BaseClassWithPrivateField {
		  public void printX() {
		 // System.out.println(x); //Illegal, can't access private field x
		  System.out.println(getX()); //Legal, prints 5
		  }
		 }
	  	  
	  
public class About4Inheritance {

	//Inheritance is a mechanism where one class acquires the properties (fields) and behaviors (methods) of another class. 
	//It helps in code reusability and method overriding

	//With the use of the extends keyword among classes, all the properties of the superclass (also known as the Parent
	//Class or Base Class) are present in the subclass (also known as the Child Class or Derived Class)


	 public static void main(String[] args) {
		 //Instances of SubClass have inherited the method baseMethod():
		 SubClass s = new SubClass();
		 s.baseMethod(); //Valid, prints "Doing base class stuff 
		 System.out.println("*********************************************************************************************");	 
		 Subclass2 s2 = new Subclass2();
		 s2.baseMethod(); //Still valid , prints "Doing base class stuff"
		 s2.anotherMethod(); //Also valid, prints "Doing subclass2 stuff"
		 System.out.println("*********************************************************************************************");
		 SubClassInheritsPrivateField s1 = new SubClassInheritsPrivateField();
		s1.printX(); //x will have a value of 5.
		 
	 }
} 