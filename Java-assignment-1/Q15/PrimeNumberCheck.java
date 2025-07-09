package Q15;

import java.util.Scanner;

class PrimeNumberCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        if(num<=1){
            isPrime= false;
        }else{
            int i=2;
            while (i<=Math.sqrt(num)) {
                if (num%i==0){
                    isPrime= false;
                    break;
                    
                }
                i++;
            }
        }
        if (isPrime){
            System.out.println("The number is prime");
        }else{
            System.out.println("The number is not prime");
        }
        sc.close();
    }
}