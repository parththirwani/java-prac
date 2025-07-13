package Q16;

import java.util.Scanner;

public class Recursion {
    public static long factorinal(int num){
        if (num ==0 || num==1){
            return 1;
        }else{
            return num*factorinal(num-1); 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        if(num<0){
            System.out.println("The number has to be positive");
        }else{
            long result = factorinal(num);
            System.out.println("The factorial of "+num+" is "+result);
        }
        sc.close();
    }
}
