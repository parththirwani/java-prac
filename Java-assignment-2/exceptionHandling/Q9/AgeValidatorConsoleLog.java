package exceptionHandling.Q9;

import java.util.Scanner;
import java.util.logging.*;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeValidatorConsoleLog {

    // Create logger instance (uses ConsoleHandler by default)
    private static final Logger logger = Logger.getLogger(AgeValidatorConsoleLog.class.getName());

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid age: " + age + ". Must be 18 or above.");
        } else {
            System.out.println("Age is valid. Access granted.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());

            // Log the exception to the terminal
            logger.log(Level.SEVERE, "Exception: " + e.getMessage());
        }

        scanner.close();
    }
}

