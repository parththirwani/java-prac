package func.Q3;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int len = sc.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>(len);

        for (int i = 0; i < len; i++) {
            System.out.print("Enter element" + (i + 1)+": ");
            int num = sc.nextInt();
            numbers.add(num);
        }
        for (int i = 0; i < len; i++) {
            if(i>0)System.out.print(" ");
            System.out.print(numbers.get(i));
        }
        sc.close();
    }
}
