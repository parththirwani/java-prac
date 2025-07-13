package Q29;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of cols: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.print("Enter the elements in the array: ");

        for (int i = 0; i < rows; i++) {   //rows
            for (int j = 0; j < cols; j++) {    //cols
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("The 2D array is: ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }

        }
        sc.close();

    }
}