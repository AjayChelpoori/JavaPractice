package practice;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayDesending {
    public static void main(String[] args){
        Integer[] array = {7,2,9,1,4,5};

        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Sorted Array in desending order: "+Arrays.toString(array));

    }
}
