package Q26;

import java.util.Scanner;

public class ReverseAray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("The " + (i + 1) + " element is: ");
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }
        System.out.print("The array is: ");
        for (int i = 0; i < arr.length; i++) {

            if (i > 0)System.out.print(" ");
            System.out.print(arr[i]);
        }
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int temp= arr[left];
            arr[left]= arr[right];
            arr[right]= temp;
            left++;
            right--;
        }
        System.out.print("\n The reversed array is: ");
        for (int i = 0; i < arr.length; i++) {
        if(i>0)System.out.print(" ");
        System.out.print(arr[i]);
        }
        sc.close();
    }
}
