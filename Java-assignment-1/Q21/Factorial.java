package Q21;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int num){
        if (num==0|| num==1){
            return 1;
        }else{
            return num*factorial(num-1);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for factorial: ");
        int num = sc.nextInt();

        int result = factorial(num);
        System.out.println("The factorial of "+num+" is: "+result);
        sc.close();
    }
}
