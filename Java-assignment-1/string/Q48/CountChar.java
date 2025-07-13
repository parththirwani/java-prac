package string.Q48;

import java.util.Scanner;

public class CountChar {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String word = sc.nextLine();

        char[] chars = word.toCharArray();

        System.out.println("The array of chars is: ");
        int count= 0;

        for(int i = 0; i<chars.length; i++){
            if(i>0)System.out.print(" ");
            System.out.print(chars[i]);
            count++;

        }
        System.out.println("\nThe count is "+count);
        
        sc.close();
    }
    
}

