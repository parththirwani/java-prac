package Q23;

import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int len = sc.nextInt();
        int first = 0;
        int second = 1;

        for (int i = 0; i < len; i++) {
            System.out.print(first);
            if (i < len - 1) {
                System.out.print(" ");
            }

            int next = first + second;
            first = second;
            second = next;
        }

        sc.close();
    }
}
