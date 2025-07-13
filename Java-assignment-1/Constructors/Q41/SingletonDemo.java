package Constructors.Q41;

class Singleton {
    // Step 1: Create a static instance of the class
    private static Singleton singleInstance = null;

    // Step 2: Make the constructor private
    private Singleton() {
        System.out.println("Singleton instance created.");
    }

    // Step 3: Provide a public method to get the instance
    public static Singleton getInstance() {
        if (singleInstance == null) {
            singleInstance = new Singleton();
        }
        return singleInstance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

public class SingletonDemo {
    public static void main(String[] args) {
        // Trying to get multiple instances
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        obj1.showMessage();

        // Check if both are same instance
        System.out.println("Are both objects same? " + (obj1 == obj2));
    }
}
