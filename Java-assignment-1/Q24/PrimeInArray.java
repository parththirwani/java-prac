package Q24;

import java.util.Scanner;

public class PrimeInArray {

    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }else{
            int i=2;
            while(i<=Math.sqrt(num)){
                if (num%i==0){
                    return false;
                }
                i++;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int len = sc.nextInt();

        int[] arr = new int[len];
        System.out.println("Enter the elemnts of the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element" + (i + 1)+": ");
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }
        System.out.print("The elements in the array are: ");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0)
                System.out.print(" ");
            System.out.print(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if(isPrime(arr[i])){
                System.out.println(arr[i]+" is prime");
            }else{
                System.out.println(arr[i]+" is not prime");   
            }
        }
        sc.close();
    }
}