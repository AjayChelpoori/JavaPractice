package javaProgramPractice.arrays;

public class FindSecondLargestNumber {
    public static void main(String[] args){
        int[] array = {10,11,72,-9,34};
        if (array.length <2 ){
            throw new IllegalArgumentException("Array must have atleast two elements");
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num: array
             ) {
            if(num > max){
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }
        if(secondMax == Integer.MIN_VALUE){
            throw new IllegalArgumentException("No second large element in array");
        }
        System.out.print(secondMax);
    }
}
