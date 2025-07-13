package string.Q47;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string you want to reverse: ");
        String word = sc.nextLine();

        char[] chars = word.toCharArray();
        int left = 0;
        int right = chars.length-1;

        while(left<right){
            char temp = chars[left];
            chars[left]= chars[right];
            chars[right]= temp;

            left++;
            right--;
        }
        String reversed = new String(chars);

        System.out.println("The reversed string is: "+reversed);

        sc.close();
    }
}
