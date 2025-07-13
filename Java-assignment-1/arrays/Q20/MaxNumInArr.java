package Q20;

import java.util.Scanner;

public class MaxNumInArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the legnth of the array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];

        System.out.println("Enter the elements in your array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + (i + 1) + " is:");
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }
        System.out.println("\nThe final array is: ");
        for (int i = 0; i < arr.length; i++) {
            if(i>0)System.out.print(" ");
            System.out.print(arr[i]);
        }
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }

        System.out.println("\nThe max element in array is: "+max);
        sc.close();
    }
}