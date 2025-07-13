package operators.Q32;

import java.util.Scanner;

public class OperatorsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two integers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // -------- Arithmetic Operators --------
        System.out.println("\n--- Arithmetic Operators ---");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));  // integer division
        System.out.println("a % b = " + (a % b));  // remainder

        // -------- Relational Operators --------
        System.out.println("\n--- Relational Operators ---");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // -------- Logical Operators --------
        System.out.println("\n--- Logical Operators ---");

        boolean x = (a > 0);
        boolean y = (b > 0);

        System.out.println("a > 0 AND b > 0 : " + (x && y));  // AND
        System.out.println("a > 0 OR b > 0  : " + (x || y));  // OR
        System.out.println("NOT (a > 0)     : " + (!x));      // NOT

        sc.close();
    }
}

