package Inheritance.Q44;

// Abstract class
abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    // Abstract method (no body)
    abstract void makeSound();

    // Non-abstract method
    void sleep() {
        System.out.println(name + " is sleeping...");
    }
}

// Subclass that inherits from Animal
class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    // Overriding the abstract method
    @Override
    void makeSound() {
        System.out.println(name + " says: Woof Woof!");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        // You cannot create an object of an abstract class
        // Animal a = new Animal("SomeAnimal"); // ❌ Not allowed

        // Create an object of subclass
        Dog dog = new Dog("Buddy");

        dog.makeSound(); // Abstract method overridden
        dog.sleep();     // Concrete method from abstract class
    }
}
