package javaPractice;

public class BubbleSort {

    public static void main(String[] args){
        int[] numbers = {10, 23, 65 ,92, 9, 3 ,24};
        bubbleSort(numbers);
        for (int num:numbers
             ) {
            System.out.print(num+",");
        }
    }
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            for(int j = 0; j < n-i-1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j +1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
