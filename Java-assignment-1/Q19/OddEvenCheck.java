package Q19;

import java.util.Scanner;

public class OddEvenCheck{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the length of the array: ");
    int len = sc.nextInt();
    int[] arr= new int[len];

    System.out.println("Enter the elements of the array");
    for(int i=0; i<arr.length;i++){
        System.out.print("Enter element "+(i+1)+": ");
        if(sc.hasNextInt()){
            arr[i]= sc.nextInt();
        }
    }
    System.out.print("The final array is: ");
    for(int i=0;i<arr.length;i++){
        if(i>0)System.out.print(" ");
        System.out.print(arr[i]);
    }
    System.out.println("\nThe odd and even numbers are:");
    for(int i=0;i<arr.length;i++){
    if(arr[i]%2==0){
        System.out.println(arr[i]+" is even");
    }else{
        System.out.println(arr[i]+" is odd");
    }
}
    sc.close();
    }
}