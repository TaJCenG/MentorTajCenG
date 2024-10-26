package OOPSConcepts;
abstract class Car
{
 abstract void tagLine();
 
}
class Honda extends Car
{
 void tagLine()
 {
 System.out.println("Start Something Special");
 }
}
class Toyota extends Car
{
 void tagLine()
 {
 System.out.println("Drive Your Dreams");
 }
}
public class About3AbstractClass {

	//Abstraction is the concept of hiding the complex implementation details and showing only the necessary features of an object. 
	//In Java, abstraction is achieved using abstract classes and Interfaces

	//If a class is declared as abstract then the sole purpose is for the class to be extended
	
	    public static void main(String[] args) {
	    	Car mycar = new Honda();
	    	Car Toyota = new Toyota();
	    	mycar.tagLine();  
	    	Toyota.tagLine();
	    }
}
