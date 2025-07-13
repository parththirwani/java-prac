package functionalInterface.Q5;

import java.util.ArrayList;
import java.util.Scanner;

public class SortStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of words in the array: ");
        int len = sc.nextInt();
        sc.nextLine(); 

        ArrayList<String> words = new ArrayList<>(len);

        for (int i = 0; i < len; i++) {
            System.out.print("Enter word " + (i + 1) + ": ");
            String word = sc.nextLine();  
            words.add(word);
        }

        words.sort((s1, s2) -> s2.compareTo(s1));


        System.out.println("\nSorted words:");
        for (int i = 0; i < len; i++) {
            System.out.print(words.get(i));
            if (i < len - 1) System.out.print(" ");
        }

        sc.close();
    }
}
