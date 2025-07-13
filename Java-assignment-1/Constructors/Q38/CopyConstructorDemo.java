package Constructors.Q38;

class Student {
    String name;
    int age;

    // Parameterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Student(Student other) {
        this.name = other.name;
        this.age = other.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class CopyConstructorDemo {
    public static void main(String[] args) {
        // Creating the first object
        Student student1 = new Student("Alice", 20);

        // Using the copy constructor
        Student student2 = new Student(student1);

        // Displaying both objects
        System.out.println("Original Object:");
        student1.display();

        System.out.println("Copied Object:");
        student2.display();
    }
}
