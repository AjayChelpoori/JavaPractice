package practice;

public class SecondThirdLargeNumber {
    public static void main(String[] args){
    int[] arr = {10,-2,3,55,34,49,44};
    int[] results = secondLarge(arr);
        System.out.print("{"+results[0]+",");
        System.out.print(results[1]+",");
        System.out.print(results[2]+"}");
    }
    public static int[] secondLarge(int[] array){

        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        for (int num: array
             ) {
            if(num > max){
                thirdMax = secondmax;
                secondmax = max;
                max = num;
            } else if (num > secondmax && num != max) {
                thirdMax = secondmax;
                secondmax = num;
            } else if (num > thirdMax && num != secondmax && num != max) {
                thirdMax = num;
            }
        }
        return new int[]{max,secondmax,thirdMax};
    }
}
