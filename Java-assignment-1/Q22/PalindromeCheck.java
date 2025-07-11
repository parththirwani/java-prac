package Q22;

import java.util.Scanner;

public class PalindromeCheck{
    public static boolean isPalindrome(String input){
        input = input.replaceAll("\\s","").toLowerCase();

        int left = 0;
        int right = input.length() -1;

        while(left<right){
            if(input.charAt(left)!= input.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string or num to check for palindrome: ");
        String userInput = sc.nextLine();
        if(isPalindrome(userInput)){
            System.out.println(userInput+" is a palindrome");
        }else{
            System.out.println(userInput+" is not a palindrome");
        }
        sc.close();
    }
}