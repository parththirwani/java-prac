package Q10;

import java.util.Scanner;

// Custom Exception
class NegativeFactorial extends Exception {
    NegativeFactorial(String message) {
        super(message);
    }
}

public class Factorial {

    // Method with 'throws' and proper return type
    public int fact(int num) throws NegativeFactorial {
        if (num < 0) {
            throw new NegativeFactorial("Factorial of negative number doesn't exist");
        } else if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * fact(num - 1);  // Recursive call
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Factorial obj = new Factorial();

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        try {
            int result = obj.fact(number);
            System.out.println("Factorial of " + number + " is: " + result);
        } catch (NegativeFactorial e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
