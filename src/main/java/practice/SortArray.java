package practice;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {

    public static void main(String[] args){
        Integer[] array = {7,2,9,1,4,5};
        assending(array);
        desending(array);
    }
    public static void assending(Integer[] arr){
        Arrays.sort(arr);
        System.out.println("Sorted Array in Assending order: "+Arrays.toString(arr));
    }
    public static void desending(Integer[] arr){
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Sorted Array in desending order: "+Arrays.toString(arr));
    }
}
