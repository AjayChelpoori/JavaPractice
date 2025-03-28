package practice;

public class SortingArray {
    public static void main(String[] args){
        int[] array = {9,23,84,92,84,67,91,4,2,6,1};
        bubbleSort(array);
        for (int num: array
             ) {
            System.out.print(num+" ");
        }
    }


    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i =0; i < n-1; i++){
            for(int j=0; j< n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
