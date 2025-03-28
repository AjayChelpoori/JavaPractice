package javaProgramPractice.numbers;

public class CheckPrimeNumbers {

    public static boolean isPrimeNumbers(int number){
        if(number <=1) return false;
        for (int i = 2 ; i<= Math.sqrt(number); i++){
            if (number % i == 0){
                return false;
            }
        } return true;
    }
    public static void main(String[] args){
        int number = 35;
        for(int i = 2; i <= number; i++){
            if (isPrimeNumbers(i)){
                System.out.print(i+" ");
            }
        }

    }
}
