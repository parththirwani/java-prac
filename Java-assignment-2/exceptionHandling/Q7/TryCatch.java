package exceptionHandling.Q7;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numerator: ");
        int numerator = sc.nextInt();

        System.out.print("Enter the denominator: ");
        int denominator = sc.nextInt();

        try {
            int result = numerator / denominator;
            System.out.println("Result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught error is: " + e.getMessage());
        }

        try {
            int result = numerator / denominator;
            System.out.println("Result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught error is: " + e.getMessage());
        }finally{
            System.out.println("Finally blocked exexuted all the cleanup operations");
        }
        sc.close();
    }
}
