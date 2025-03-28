package javaProgramPractice.arrays;

public class ThirdMaxNumber {
    public static void main(String[] args){

        int[] array = {99,23,-3,45,87,22,105};
        if (array.length < 3){
            throw new IllegalArgumentException("Array should have atleast 3 elements");
        }
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;

        for (int number:array
             ) {
            if(number > first){
                third = second;
                second = first;
                first = number;
            } else if (number > second && number != first) {
                third = second;
                second = number;
            } else if (number > third && number != second && number != first) {
                third= number;
            }
        }
        System.out.print(first+","+second+","+third);
    }
}
