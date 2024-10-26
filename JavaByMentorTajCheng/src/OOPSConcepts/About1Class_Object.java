package OOPSConcepts;

public class About1Class_Object { // this is class 
	// A class is a blueprint for creating objects. 
	//It defines a datatype by bundling data and methods that work on the data into one single unit.

			String name;
			int age;
			
	public static void main(String[] args) {
	//	******************************The Below was the basic object creation which not used in Companies ******************************		
		About1Class_Object objectCreation = new About1Class_Object();
		
		objectCreation.name ="Taj";
		objectCreation.age = 24;
		System.out.println("name : " + objectCreation.name);
		System.out.println("age : " + objectCreation.age);
//******************************The above was the basic object creation which not used in Companies ******************************
//****************************** In Encapsulation you will learn how to create data and objects ******************************
	}

}
