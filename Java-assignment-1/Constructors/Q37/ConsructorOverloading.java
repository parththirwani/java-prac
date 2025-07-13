package Constructors.Q37;

public class ConsructorOverloading {

    // Default constructor
    public ConsructorOverloading() {
        System.out.println("Hi there from default constructor");
    }

    // Parameterized constructor
    public ConsructorOverloading(int i) {
        System.out.println("The number is " + i);
    }

    public static void main(String[] args) {
        // Calling default constructor
        ConsructorOverloading c1 = new ConsructorOverloading();

        // Calling parameterized constructor
        ConsructorOverloading c2 = new ConsructorOverloading(42);
    }
}
