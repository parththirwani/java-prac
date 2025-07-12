package Q25;

import java.util.Scanner;

public class SumInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int len = sc.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the " + (i + 1) + " element: ");
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }
        System.out.print("The array is: ");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0)
                System.out.print(" ");
            System.out.print(arr[i]);
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];
        }
        System.out.println("\nThe sum is: "+sum);
        sc.close();
    }
}
