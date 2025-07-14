package exceptionHandling.Q8;

import java.util.Scanner;

class InvalidAgeExcepion extends Exception{
    public InvalidAgeExcepion(String message){
        super(message);
    }
}

public class AgeValidation {
    public static void checkAge(int age) throws InvalidAgeExcepion{
        if(age<18){
            throw new InvalidAgeExcepion("The age should be greater than 18 to enter");
        }else{
            System.out.println("Good to enter");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            checkAge(age);
        } catch (InvalidAgeExcepion e) {
            System.out.println("Exception detected: "+e.getMessage());
        }
        sc.close();
    }
}
