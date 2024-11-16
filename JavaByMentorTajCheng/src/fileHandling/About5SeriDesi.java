package fileHandling;

import java.io.*;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class About5SeriDesi {
    public static void main(String[] args) {
        Employee employee = new Employee("John", 30);

        // Serialization
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
            out.writeObject(employee);
            System.out.println("Serialization successful.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.ser"))) {
            Employee deserializedEmployee = (Employee) in.readObject();
            System.out.println("Deserialization successful.");
            System.out.println("Name: " + deserializedEmployee.name + ", Age: " + deserializedEmployee.age);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
