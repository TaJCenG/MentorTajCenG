package OOPSConcepts;

//Imagine you had a class with some pretty important variables and they were set (by other programmers from their
//code) to unacceptable values.Their code brought errors in your code. As a solution, In OOP, you allow the state of
//an object (stored in its variables) to be modified only through methods. Hiding the state of an object and providing
//all interaction through an objects methods is known as Data Encapsulation
public class About2Encapsulation {

	//Encapsulation is the technique of wrapping the data (variables) and code (methods) together as a single unit. 
	//It restricts direct access to some of an object’s components, which can prevent the accidental modification of data.

	
	//data (variables)
	String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	int age;
	
public static void main(String[] args) {
//	******************************The Below was the  object creation which used in Companies ******************************		
	About2Encapsulation objectCreation = new About2Encapsulation();

objectCreation.setName("Taj");
objectCreation.setAge(24);
System.out.println("name : " + objectCreation.getName());
System.out.println("age : " +objectCreation.getAge());
//******************************The above was the basic object creation which used in Companies ******************************

}
}
