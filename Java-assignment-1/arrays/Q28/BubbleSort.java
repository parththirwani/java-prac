public class BubbleSort {
    public static void bubble(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 6, 2, 3 };
        bubble(arr);
        System.out.print("The sorted array is: ");
        for (int i = 0; i < arr.length; i++) {
            if(i>0)System.out.print(" ");
            System.out.print(arr[i]);
        }
    }
}