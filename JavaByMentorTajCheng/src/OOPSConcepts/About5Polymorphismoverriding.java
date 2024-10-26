package OOPSConcepts;


//Method overriding is the ability of subtypes to redefine (override) the behavior of their supertypes.
//When a method is called on a reference, the corresponding method of the actual object being pointed to is invoked.
//To override a method in the subclass, the overriding method (i.e. the one in the subclass) MUST HAVE same name
//same return type in case of primitives (a subclass is allowed for classes, this is also known as covariant return types).
//same type and order of parameters it may throw only those exceptions that are declared in the throws clause of the superclass's method or
//exceptions that are subclasses of the declared exceptions. It may also choose NOT to throw any exception.
//The names of the parameter types do not matter. For example, void methodX(int i) is same as void methodX(int k)
//We are unable to Override final or Static methods. Only thing that we can do change only method body.

class SuperType {
	 public void sayHello(){
	 System.out.println("Hello from SuperType");
	 }
	 public void sayBye(){
	 System.out.println("Bye from SuperType");
	 }
	}
	class SubType extends SuperType {
	 // override the superclass method
	 public void sayHello(){
	 System.out.println("Hello from SubType");
	 }
	}



public class About5Polymorphismoverriding {
//Polymorphism allows methods to do different things based on the object it is acting upon. It can
//be achieved through method overloading and method overriding.
//poly means "many" and morphs means "forms" (many forms).
	public static void main(String[] args) {
		SuperType superType = new SuperType();
		 superType.sayHello(); // -> Hello from SuperType
		 // make the reference point to an object of the subclass
		 superType = new SubType();
		 // behaviour is governed by the object, not by the reference
		 superType.sayHello(); // -> Hello from SubType
		 // non-overridden method is simply inherited
		 superType.sayBye(); // -> Bye from SuperType

	}

}
