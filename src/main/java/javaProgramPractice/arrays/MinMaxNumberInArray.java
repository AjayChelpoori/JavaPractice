package javaProgramPractice.arrays;

public class MinMaxNumberInArray {
    public static void main(String[] args){
        int[] array = {87,92,73,10,62,77,234,5};
        int min = 1, max = 0;
        for(int i =0; i< array.length;i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println(max);
        for(int  i= array.length-1; i >=0; i--){
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
