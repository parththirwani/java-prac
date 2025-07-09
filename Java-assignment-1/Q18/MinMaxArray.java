package Q18;

public class MinMaxArray {
    public static void main(String[] args) {
        int arr[]= {12,23,45,17,64};

        int min = arr[0];
        int max = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i]<min){
                min= arr[i];
            }
            if(arr[i]>max){
                max= arr[i];
            }
        }
        System.out.println("The minimum number out of array is "+min);
        System.out.println("The max out of the array is  "+max);
    }
}
