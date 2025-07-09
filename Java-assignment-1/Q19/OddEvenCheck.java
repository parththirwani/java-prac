package Q19;

import java.util.Scanner;

public class OddEvenCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int len = 0;
        if (sc.hasNextInt()) {
            len = sc.nextInt();
        }

        int[] arr = new int[len]; // creates array of len+1 size

        System.out.println("Enter the numbers for the array:");
        for (int i = 0; i < len; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                sc.next(); 
            }
            arr[i] = sc.nextInt();
        }

        // Print array elements
        System.out.println("\nThe elements of the array are:");
        for (int i = 0; i < len; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(arr[i]);
        }

        // Check and print odd/even for each element
        System.out.println("\n\nOdd/Even check:");
        for (int i = 0; i < len; i++) {
            String type = (arr[i] % 2 == 0) ? "Even" : "Odd";
            System.out.println("Element " + (i + 1) + " (" + arr[i] + ") is " + type);
        }

        sc.close();
    }
}
